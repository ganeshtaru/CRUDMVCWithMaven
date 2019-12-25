package net.gnt.SpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import net.gnt.SpringMVC.service.PersonService;

@Controller
public class PersonController {

	private PersonService personService;
	
	@Autowired(required= true)
	@Qualifier(value="personService")
	
	public void setPersonService(PersonService ps){
		this.personService=ps;
	}
}
