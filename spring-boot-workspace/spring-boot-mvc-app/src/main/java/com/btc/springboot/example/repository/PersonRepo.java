package com.btc.springboot.example.repository;

import java.util.List;

import com.btc.springboot.example.model.Person;

public interface PersonRepo {

	public Person getPersonByName(String personName);
	
	public Person addPerson(Person person);
	
	public List<Person> getAllPersons();
	
	
}
