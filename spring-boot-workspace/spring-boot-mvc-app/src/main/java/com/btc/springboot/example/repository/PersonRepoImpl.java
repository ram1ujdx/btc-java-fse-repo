package com.btc.springboot.example.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.btc.springboot.example.model.Person;

@Repository
public class PersonRepoImpl implements PersonRepo {
	
	private Map<String, Person> personList;
	
	
	@PostConstruct
	public void init() {
		personList=new HashMap<>();
	}

	@Override
	public Person getPersonByName(String personName) {
		return personList.get(personName);
	}

	@Override
	public Person addPerson(Person person) {
		personList.put(person.getPersonName(), person);
		return person;
	}

	@Override
	public List<Person> getAllPersons() {
		List<Person> personList=new ArrayList<>();
		
		this.personList.forEach((pname,person)->{
			personList.add(person);
		});
		return personList;
	}

}
