package com.ty.Person.Person_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ty.Person.Person_app.dao.PersonDao;
import com.ty.Person.Person_app.dao.ResponseStructure;
import com.ty.Person.Person_app.dto.Person;
import com.ty.Person.Person_app.exception.MissFormatException;
import com.ty.Person.Person_app.exception.NoIdFoundException;


@Service
public class PersonService {
 
	@Autowired
	private PersonDao dao;
	
	public ResponseStructure<Person> savePerson(Person product) {

		Person product1 = dao.savePerson(product);
		ResponseStructure<Person> responseStructure = new ResponseStructure<Person>();
		if(product1 != null) {
			responseStructure.setStatus(HttpStatus.OK.value());
			responseStructure.setMessage("success");
			responseStructure.setData(product1);
			return responseStructure;
		}
		throw new MissFormatException("missmatch");
	}
	public ResponseStructure<Person> getById(int id) {
		Person product1 = dao.getByIdPerson(id);
		ResponseStructure<Person> responseStructure = new ResponseStructure<Person>();
		if(product1 != null) {
			responseStructure.setStatus(HttpStatus.OK.value());
			responseStructure.setMessage("success");
			responseStructure.setData(product1);
			return responseStructure;
		}
		 throw new NoIdFoundException(" no id persent here") ;
	}
}
