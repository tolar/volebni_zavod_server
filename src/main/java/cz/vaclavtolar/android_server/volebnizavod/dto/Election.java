package cz.vaclavtolar.android_server.volebnizavod.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Election {

    private String id;
    private String name;
    private LocalDate date;

    @JsonIgnore
    private String vysledkyUrl;
    @JsonIgnore
    private String vysledkyXmlData;
    @JsonIgnore
    private Object vysledkyData;

    private LocalDateTime dataUpdated;

    @JsonIgnore
    private String vysledkyOkresUrl;
    @JsonIgnore
    private Map<Okres,String> vysledkyOkresXmlData = new HashMap<>(100);
    @JsonIgnore
    private Map<Okres,Object> vysledkyOkresData = new HashMap<>(100);

    private LocalDateTime okresDataUpdated;

    public Election(String id, String name, LocalDate date, String vysledkyUrl, String vysledkyOkresUrl) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.vysledkyUrl = vysledkyUrl;
        this.vysledkyOkresUrl = vysledkyOkresUrl;
    }

}
