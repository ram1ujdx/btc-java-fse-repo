package com.btc.springboot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btc.springboot.example.model.Person;
import com.btc.springboot.example.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonRestController {

	
	@Autowired
	PersonService service;
	
	@GetMapping("/persons/person-name/{personName}")
	public Person getPersonByName(@PathVariable("personName") String personName) {
		return service.getPersonByName(personName);
	}
	
	@GetMapping("/persons")
	public List<Person> getAllPersons(){
		return service.getAllPersons();
	}
	
	@PostMapping("/persons")
	public Person addPerson(@RequestBody Person person) {
		
		Person savedPerson = service.addPerson(person);
		return savedPerson;
	}
	

	@PutMapping("/persons")
	public Person updatePerson(@RequestBody Person person) {
		
		Person updatedPerson = service.updatePerson(person);
		return updatedPerson;
	
	}
	
	
	@DeleteMapping("/persons/id/{id}")
	public boolean deletePersonById(@PathVariable("id") long id) {
		return service.deletePersonById(id);
	}
	
	
}
