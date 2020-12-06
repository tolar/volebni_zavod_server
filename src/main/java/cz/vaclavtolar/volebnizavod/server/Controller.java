package cz.vaclavtolar.volebnizavod.server;

import cz.vaclavtolar.volebnizavod.server.dto.Election;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    private DataService dataService;

    @GetMapping("/elections")
    public List<Election> getElections() {
        return dataService.getElections();
    }

    @GetMapping("/elections/{id}")
    public Object getElection(@PathVariable String id) {
        return dataService.getElection(id);
    }
}
