package com.btc.springboot.example.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.btc.springboot.example.model.Person;
import com.btc.springboot.example.repository.PersonRepo;

@Controller
public class PersonController {
	
	@Autowired
	PersonRepo personRepo;
	
	@Value("${title}")
	private String title;
	
	@GetMapping
	public String getDefaultPage(HttpSession ssn) {
		ssn.setAttribute("title", title);
		return "search.jsp";
	}

	@GetMapping("/get-person")
	public String getPersonInfo(@RequestParam("person-name") String personName, Model m) {
		
		Person person=personRepo.getPersonByName(personName);
		
		m.addAttribute("person", person);
		return "show.jsp";
	}
	
	@PostMapping("/add-person")
	public String addPerson(@ModelAttribute("person") Person person) {
		
		personRepo.addPerson(person);
		
		return "show.jsp";
	}
	
	@GetMapping("/show-all")
	public String showAllPersons(Model m) {
		
		List<Person> personList=personRepo.getAllPersons();
		m.addAttribute("peerson-list", personList);
		
		return "show-all.jsp";
	}
	
	
	
}
