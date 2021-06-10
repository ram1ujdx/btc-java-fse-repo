package com.btc.springboot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.btc.springboot.example.model.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

	@Query("from Person where personName=:personName")
	public Person findByPersonName(@Param("personName") String personName);
	
	
	public Person findByPersonNameAndEmail(String personName, String email);
	
	//@Query("from Person where email=:email")
	public boolean existsByEmail(String email);
	
}
