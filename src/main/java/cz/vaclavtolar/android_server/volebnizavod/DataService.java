package cz.vaclavtolar.android_server.volebnizavod;

import cz.vaclavtolar.android_server.volebnizavod.dto.Election;
import cz.vaclavtolar.android_server.volebnizavod.dto.Okres;
import cz.vaclavtolar.android_server.volebnizavod.jaxb.snemovna.cr_kraje.VYSLEDKY;
import cz.vaclavtolar.android_server.volebnizavod.jaxb.snemovna.okresy_obce.VYSLEDKYOKRES;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
                        "https://volby.cz/pls/ps2017nss/vysledky",
                        "https://volby.cz/pls/ps2017nss/vysledky_okres"
                        ));
        elections.add(
                new Election(
                        "2", "Sněmovna 2013",
                        LocalDate.of(2013, 10, 26),
                        "https://volby.cz/pls/ps2013/vysledky",
                        "https://volby.cz/pls/ps2013/vysledky_okres"));
        elections.add(
                new Election(
                        "3", "Sněmovna 2010",
                        LocalDate.of(2010, 5, 29),
                        "https://volby.cz/pls/ps2010/vysledky",
                        "https://volby.cz/pls/ps2010/vysledky_okres"));
        elections.add(
                new Election(
                        "4", "Sněmovna 2006",
                        LocalDate.of(2006, 6, 3),
                        "https://volby.cz/pls/ps2006/vysledky",
                        "https://volby.cz/pls/ps2006/vysledky_okres"
                ));
        loadData();
    }

    private void loadData() {
        elections.stream().forEach(election -> {
            try {
                loadVysledkyFromServer(election);
                loadVysledkyOkresFromServer(election);
            } catch (Exception e) {
                log.error("Failed to load election data from volby.cz", e);
            }
        }
        );
    }

    private void loadVysledkyFromServer(Election election) throws IOException, JAXBException {
        URL url = new URL(election.getVysledkyUrl());
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
            election.setVysledkyXmlData(content.toString());

            JAXBContext jaxbContext = JAXBContext.newInstance(VYSLEDKY.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Object parsedData = jaxbUnmarshaller.unmarshal(IOUtils.toInputStream(election.getVysledkyXmlData()));
            election.setVysledkyData(parsedData);
            election.setDataUpdated(LocalDateTime.now());
            log.info("Loaded overall result for {}", election.getDate().getYear());
        }
        con.disconnect();
    }

    private void loadVysledkyOkresFromServer(Election election) throws IOException, JAXBException {
        for (Okres okres: Okres.values()) {
            URL url = new URL(election.getVysledkyOkresUrl() + "?nuts=" + okres.getCode());
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
                election.getVysledkyOkresXmlData().put(okres, content.toString());

                JAXBContext jaxbContext = JAXBContext.newInstance(VYSLEDKYOKRES.class);

                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Object parsedData = jaxbUnmarshaller.unmarshal(IOUtils.toInputStream(election.getVysledkyOkresXmlData().get(okres)));
                election.getVysledkyOkresData().put(okres, parsedData);
                log.info("Loaded {} district result for {}", okres, election.getDate().getYear());
            }
        }
        election.setOkresDataUpdated(LocalDateTime.now());
    }

    public List<Election> getElections() {
        return elections;
    }

    public Object getElection(String id) {
        final Election electionById = getElections().stream().filter(
                election -> election.getId().equals(id)).findFirst().orElse(null);
        if (electionById == null || electionById.getDataUpdated() == null) {
            return null;
        }
        return electionById.getVysledkyData();
    }

    public List<Object> getElectionDistricts(String id) {
        final Election electionById = getElections().stream().filter(
                election -> election.getId().equals(id)).findFirst().orElse(null);
        if (electionById == null || electionById.getOkresDataUpdated() == null) {
            return null;
        }
        return electionById.getVysledkyOkresData().values().stream().collect(Collectors.toList());

    }
}
