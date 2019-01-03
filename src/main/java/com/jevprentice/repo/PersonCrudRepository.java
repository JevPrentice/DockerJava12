package com.jevprentice.repo;

import com.jevprentice.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonCrudRepository extends CrudRepository<Person, Long> {
    List<Person> findByLastName(String lastName);
}

