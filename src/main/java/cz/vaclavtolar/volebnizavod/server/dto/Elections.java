package cz.vaclavtolar.volebnizavod.server.dto;

import java.util.ArrayList;
import java.util.List;

public class Elections {

    private List<Election> elections = new ArrayList<>(10);

    public List<Election> getElections() {
        return elections;
    }

    public void setElections(List<Election> elections) {
        this.elections = elections;
    }
}
