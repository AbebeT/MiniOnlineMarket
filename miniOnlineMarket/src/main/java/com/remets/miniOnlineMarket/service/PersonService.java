package com.remets.miniOnlineMarket.service;

import com.remets.miniOnlineMarket.domain.Cart;
import com.remets.miniOnlineMarket.domain.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface PersonService {
    public List<Person> getAll();

    public Optional<Person> getById(Long id);

    public void addPerson(Person person);

    public void deleteById(long id);
}
