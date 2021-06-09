package com.btc.springboot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.btc.springboot.example.model.Person;
import com.btc.springboot.example.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@PostMapping("/add-person")
	public String addPerson(@ModelAttribute Person person, Model m) {
		
		Person savedPerson = service.addPerson(person);
		m.addAttribute("person", savedPerson);
		return "show.jsp";
	}
	
	
	
	
	
	@GetMapping("/search")
	public String searchPersonByName(@RequestParam("personName") String personName, Model m) {
		
		Person person= service.getPersonByName(personName);
		m.addAttribute("person", person);
		return "show.jsp";
	}
	
	
	
	

}
