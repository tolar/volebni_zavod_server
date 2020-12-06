package cz.vaclavtolar.volebnizavod.server.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class Election {

    private String id;
    private LocalDate date;
    @JsonIgnore
    private String serverUrl;
    @JsonIgnore
    private String serverXmlData;
    private Object data;
    private LocalDateTime updated;

    public Election(String id,LocalDate date, String serverUrl) {
        this.id = id;
        this.date = date;
        this.serverUrl = serverUrl;
    }

}
