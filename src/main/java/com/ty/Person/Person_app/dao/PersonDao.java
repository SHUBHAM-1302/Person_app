package com.ty.Person.Person_app.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.Person.Person_app.dto.Person;
import com.ty.Person.Person_app.repository.PersonRepository;

@Repository
public class PersonDao {

	@Autowired
	private PersonRepository personRepository ;
	
	public Person savePerson(Person person) {
		return personRepository.save(person);
	}
	
	public Person getByIdPerson(int id) {
		Optional<Person> optional = personRepository.findById(id);
		return optional.get();
	}
}
