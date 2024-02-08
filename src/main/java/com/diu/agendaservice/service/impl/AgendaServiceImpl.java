package com.diu.agendaservice.service.impl;

import com.diu.agendaservice.entity.Person;
import com.diu.agendaservice.repository.AgendaRepository;
import com.diu.agendaservice.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaServiceImpl implements AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    @Override
    public List<Person> obtainListPerson() {
        return agendaRepository.findAll();
    }

    @Override
    public Optional<Person> obtainPerson(String id) {
        return agendaRepository.findById(id);
    }

    @Override
    public Person addPerson(Person p) {
        return agendaRepository.save(p);
    }

    @Override
    public Person editPerson(Person p) {
        return agendaRepository.save(p);
    }

    @Override
    public void deletePerson(String id) {
        agendaRepository.deleteById(id);
    }
}
