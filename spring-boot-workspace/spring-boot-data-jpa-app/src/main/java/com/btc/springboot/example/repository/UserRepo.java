package com.btc.springboot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btc.springboot.example.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
