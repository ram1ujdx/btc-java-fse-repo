package com.btc.springboot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btc.springboot.example.model.User;
import com.btc.springboot.example.repository.UserRepo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/public")
@Slf4j
public class UserController {
	
	@Autowired
	UserRepo repo;

	@PostMapping("/users")
	public User addUsers(@RequestBody User user) {
		log.info("Reading User...");
		return repo.save(user);
	}
	
	
	@GetMapping("/users")
	public List<User> getAllUser(){
		return repo.findAll();
	}
	
}
