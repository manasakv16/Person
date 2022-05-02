package com.manasa.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {
	
	@RequestMapping("/show")
	public String showCreate() {
		return "CreatePerson";
	}
	
	@RequestMapping("displayPerson")
	public String saveperson() {
		
		return "displayPerson";
	}

}
