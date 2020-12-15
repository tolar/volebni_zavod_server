package cz.vaclavtolar.volebnizavod.server.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class Election {

    private String id;
    private String name;
    private LocalDate date;
    @JsonIgnore
    private String serverUrl;
    @JsonIgnore
    private String serverXmlData;
    @JsonIgnore
    private Object data;
    private LocalDateTime updated;

    public Election(String id, String name, LocalDate date, String serverUrl) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.serverUrl = serverUrl;
    }

}
