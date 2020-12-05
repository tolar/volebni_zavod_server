package cz.vaclavtolar.volebnizavod.server.dto;

import java.time.LocalDate;

public class Election {

    private String id;
    private LocalDate date;
    private String serverUrl;
    private String serverXmlData;
    private Object parsedData;

    public Election(String id,LocalDate date, String serverUrl) {
        this.id = id;
        this.date = date;
        this.serverUrl = serverUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public void setServerXmlData(String serverXmlData) {
        this.serverXmlData = serverXmlData;
    }

    public String getServerXmlData() {
        return serverXmlData;
    }

    public Object getParsedData() {
        return parsedData;
    }

    public void setParsedData(Object parsedData) {
        this.parsedData = parsedData;
    }
}
