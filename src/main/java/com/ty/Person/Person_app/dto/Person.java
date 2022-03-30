package com.ty.Person.Person_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id ;
@NotNull(message ="name should be not null")
private String name ;
@NotNull(message ="email should be not null")
private String email ;
private long phone ;
private String password ;

}
