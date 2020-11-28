package cz.vaclavtolar.volebnizavod.server.dto;

import java.time.LocalDate;

public class Election {

    private String id;
    private LocalDate date;
    private String url;
    private String data;

    public Election(String id,LocalDate date, String url) {
        this.id = id;
        this.date = date;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
