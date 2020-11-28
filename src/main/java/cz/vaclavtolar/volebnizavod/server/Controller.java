package cz.vaclavtolar.volebnizavod.server;

import cz.vaclavtolar.volebnizavod.server.dto.Election;
import cz.vaclavtolar.volebnizavod.server.dto.Elections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class Controller {

    @Autowired
    private DataService dataService;

    @GetMapping("/elections")
    public Elections getElections() {
        return dataService.getElections();
    }

    @GetMapping("/elections/{id}")
    public Election getElection(@PathVariable String id) {
        return dataService.getElection(id);
    }
}
