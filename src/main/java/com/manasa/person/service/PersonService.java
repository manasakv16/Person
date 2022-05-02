package com.manasa.person.service;

import java.util.List;

import com.manasa.person.entities.Person;

public interface PersonService {

	Person savePerson(Person person);

	Person updatePerson(Person person);

	void deletePerson(Person person);

	Person getPersonByNumber(String number);

	List<Person> getAllPerson();

}
