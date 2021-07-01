package com.btc.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btc.springboot.app.model.Employee;
import com.btc.springboot.app.repository.EmployeeRepo;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeRepo repo;
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return repo.findById(id).get();
	}
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return repo.save(employee);
	}
	
	
}
