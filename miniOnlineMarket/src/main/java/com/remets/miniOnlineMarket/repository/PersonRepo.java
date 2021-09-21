package com.remets.miniOnlineMarket.repository;
import com.remets.miniOnlineMarket.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, Long> {
}
