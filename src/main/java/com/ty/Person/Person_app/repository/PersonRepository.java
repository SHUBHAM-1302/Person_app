package com.ty.Person.Person_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Person.Person_app.dto.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
