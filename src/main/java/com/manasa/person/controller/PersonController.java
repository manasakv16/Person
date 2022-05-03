package com.manasa.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manasa.person.entities.Person;
import com.manasa.person.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@RequestMapping("/show")
	public String showCreate() {
		return "CreatePerson";
	}
	
	@RequestMapping("/savedPerson")
	public String savePerson(@ModelAttribute("person") Person person, ModelMap modelMap ) {
		Person newPerson = service.savePerson(person);
		String msg;
		if(newPerson.getNumber()!=null) {
		msg="Person saved with name: " +newPerson.getName() + " and number: " +newPerson.getNumber();
		}
		else {
			msg="Error adding a Person";
		}
		modelMap.addAttribute("msg",msg);
		return "CreatePerson";
	}
	
	@RequestMapping("/displayPerson")
	public String displayPerson(ModelMap modelMap) {
		List<Person> person = service.getAllPerson();
		modelMap.addAttribute("person", person);
		return "displayPerson";
	}
	
	@RequestMapping("deletePerson")
	public String deletePerson(@RequestParam("number")String number , ModelMap modelMap) {
		//Person persons=service.getPersonByNumber(number);
		Person persons = new Person();
		persons.setNumber(number);
		service.deletePerson(persons);
		List<Person> person= service.getAllPerson();
		modelMap.addAttribute("person", person);
		return "displayPerson";
	}
	
	@RequestMapping("/editPerson")
	public String showUpdate(@RequestParam("number")String number , ModelMap modelMap) {
		Person person = service.getPersonByNumber(number);
		modelMap.addAttribute("person", person);
		return "editPerson";
	}
	
	@RequestMapping("/updPerson")
	public String updatedPerson(@ModelAttribute("person") Person person, ModelMap modelMap) {
		Person updatePerson = service.updatePerson(person);
		List<Person> allPerson = service.getAllPerson();
		modelMap.addAttribute("person", allPerson);
		return "displayPerson";
	}
	
	
	
}
