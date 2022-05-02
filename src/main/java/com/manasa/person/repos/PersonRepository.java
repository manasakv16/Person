package com.manasa.person.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manasa.person.entities.Person;

public interface PersonRepository extends JpaRepository<Person, String> {

}
