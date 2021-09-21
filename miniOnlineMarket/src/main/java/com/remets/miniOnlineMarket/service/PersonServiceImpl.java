package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Person;
import com.remets.miniOnlineMarket.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepo personRepo;

    @Override
    public List<Person> getAll() {
        List<Person> persons = new ArrayList<>();
        personRepo.findAll().forEach((persons::add));
        return persons;
    }

    @Override
    public Optional<Person> getById(Long id) {
        return personRepo.findById(id);
    }

    @Override
    public void addPerson(Person person) {
        personRepo.save(person);
    }

    @Override
    public void deleteById(long id) {
        personRepo.deleteById(id);
    }
}
