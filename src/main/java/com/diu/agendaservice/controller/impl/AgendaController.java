package com.diu.agendaservice.controller.impl;

import com.diu.agendaservice.controller.AgendaAPI;
import com.diu.agendaservice.entity.Person;
import com.diu.agendaservice.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000/")
public class AgendaController implements AgendaAPI {

    @Autowired
    private AgendaService agendaService;

    @Override
    @GetMapping("/person")
    public List<Person> obtainListPerson() {
        return agendaService.obtainListPerson();
    }

    @Override
    @GetMapping("/person/{id}")
    public Optional<Person> obtainPerson(@PathVariable String id) {
        return agendaService.obtainPerson(id);
    }

    @Override
    @PostMapping("/person")
    public Person addPerson(@RequestBody Person p) {
        return agendaService.addPerson(p);
    }

    @Override
    @PutMapping("/person/{id}")
    public Person editPerson(@RequestBody Person p) {
        return agendaService.editPerson(p);
    }

    @Override
    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable String id) {
        agendaService.deletePerson(id);
    }
}
