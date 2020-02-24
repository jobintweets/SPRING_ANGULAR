package com.angularboot.springangular.repositories;

import com.angularboot.springangular.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person,Integer> {
  Person findByEmail(String email);

}
