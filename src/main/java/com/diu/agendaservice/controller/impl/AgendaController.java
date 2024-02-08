package com.diu.agendaservice.controller.impl;

import com.diu.agendaservice.controller.AgendaAPI;
import com.diu.agendaservice.entity.Person;
import com.diu.agendaservice.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AgendaController implements AgendaAPI {

    @Autowired
    private AgendaService agendaService;

    @Override
    public List<Person> obtainListPerson() {
        return agendaService.obtainListPerson();
    }

    @Override
    public Optional<Person> obtainPerson(String id) {
        return agendaService.obtainPerson(id);
    }

    @Override
    public Person addPerson(Person p) {
        return agendaService.addPerson(p);
    }

    @Override
    public Person editPerson(Person p) {
        return agendaService.editPerson(p);
    }

    @Override
    public void deletePerson(String id) {
        agendaService.deletePerson(id);
    }
}
