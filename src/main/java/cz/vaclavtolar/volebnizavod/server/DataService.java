package cz.vaclavtolar.volebnizavod.server;

import cz.vaclavtolar.volebnizavod.server.dto.Election;
import cz.vaclavtolar.volebnizavod.server.jaxb.snemovna._2017.VYSLEDKY;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class DataService {

    private List<Election> elections = new ArrayList<>(10);

    @PostConstruct
    public void initData() {
        elections.add(
                new Election(
                        "1", "Sněmovna 2017",
                        LocalDate.of(2017, 10, 21),
                        "https://volby.cz/pls/ps2017nss/vysledky"));
        elections.add(
                new Election(
                        "2", "Sněmovna 2013",
                        LocalDate.of(2013, 10, 26),
                        "https://volby.cz/pls/ps2013/vysledky"));
        elections.add(
                new Election(
                        "3", "Sněmovna 2010",
                        LocalDate.of(2010, 5, 29),
                        "https://volby.cz/pls/ps2010/vysledky"));
        elections.add(
                new Election(
                        "4", "Sněmovna 2006",
                        LocalDate.of(2006, 6, 3),
                        "https://volby.cz/pls/ps2006/vysledky"));
        loadData();
    }

    private void loadData() {
        elections.stream().forEach(election -> {
                    try {
                        URL url = new URL(election.getServerUrl());
                        HttpURLConnection con = (HttpURLConnection) url.openConnection();
                        con.setRequestMethod("GET");
                        if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                            BufferedReader in = new BufferedReader(
                                    new InputStreamReader(con.getInputStream()));
                            String inputLine;
                            StringBuffer content = new StringBuffer();
                            while ((inputLine = in.readLine()) != null) {
                                content.append(inputLine);
                            }
                            in.close();
                            election.setServerXmlData(content.toString());

                            JAXBContext jaxbContext = JAXBContext.newInstance(VYSLEDKY.class);

                            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                            Object parsedData = jaxbUnmarshaller.unmarshal(IOUtils.toInputStream(election.getServerXmlData()));
                            election.setData(parsedData);
                            election.setUpdated(LocalDateTime.now());
                        }
                        con.disconnect();
                    } catch (Exception e) {
                        log.error("Failed to load election data from volby.cz", e);
                    }
                }
        );
    }

    public List<Election> getElections() {
        return elections;
    }

    public Object getElection(String id) {
        final Election electionById = getElections().stream().filter(
                election -> election.getId().equals(id)).findFirst().orElse(null);
        if (electionById == null) {
            return null;
        }
        return electionById.getData();
    }
}
