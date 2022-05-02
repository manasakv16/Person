package com.manasa.person.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manasa.person.entities.Person;
import com.manasa.person.repos.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository repo;

	@Override
	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		return repo.save(person);
	}

	@Override
	public Person updatePerson(Person person) {
		// TODO Auto-generated method stub
		return repo.save(person);
	}

	@Override
	public void deletePerson(Person person) {
		// TODO Auto-generated method stub
			repo.delete(person);
	}

	@Override
	public Person getPersonByNumber(String number) {
		// TODO Auto-generated method stub
		return repo.getById(number);
	}

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
