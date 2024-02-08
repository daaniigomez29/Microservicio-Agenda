package com.diu.agendaservice.repository;

import com.diu.agendaservice.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgendaRepository extends MongoRepository<Person, String> {
}
