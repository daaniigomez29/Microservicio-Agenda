package com.diu.agendaservice.service;

import com.diu.agendaservice.entity.Person;

import java.util.List;
import java.util.Optional;

public interface AgendaService {
    List<Person> obtainListPerson();
    Optional<Person> obtainPerson(String id);
    Person addPerson(Person p);
    Person editPerson(Person p);
    void deletePerson(String id);
}
