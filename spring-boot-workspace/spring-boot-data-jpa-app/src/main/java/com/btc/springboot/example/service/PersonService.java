package com.btc.springboot.example.service;

import java.util.List;

import com.btc.springboot.example.model.Person;

public interface PersonService {
	
	public Person addPerson(Person person);
	
	public Person getPersonById(long id);
	
	public Person getPersonByName(String personName);
	
	public List<Person> getAllPersons();
	
	public Person updatePerson(Person person);
	
	public boolean deletePersonById(long id);

}
