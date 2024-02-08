package com.diu.agendaservice.controller;

import com.diu.agendaservice.entity.Person;

import java.util.List;
import java.util.Optional;

public interface AgendaAPI {
    List<Person> obtainListPerson();
    Optional<Person> obtainPerson(String id);
    Person addPerson(Person p);
    Person editPerson(Person p);
    void deletePerson(String id);
}
