package com.ty.Person.Person_app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.Person.Person_app.dao.ResponseStructure;
import com.ty.Person.Person_app.dto.Person;
import com.ty.Person.Person_app.service.PersonService;


@RestController
public class PersonController {
  @Autowired
  PersonService personService;

	@PostMapping("/person")
	public ResponseStructure<Person> savePerson(@RequestBody  @Valid Person person) {
		return personService.savePerson(person);
	}

	@GetMapping("/person")
	public ResponseStructure<Person> getIdByPerson(@RequestParam int id) {
		return personService.getById(id);
	}
	
}
