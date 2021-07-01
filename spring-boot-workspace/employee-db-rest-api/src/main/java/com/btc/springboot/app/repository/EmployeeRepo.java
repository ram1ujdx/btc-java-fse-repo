package com.btc.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btc.springboot.app.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
