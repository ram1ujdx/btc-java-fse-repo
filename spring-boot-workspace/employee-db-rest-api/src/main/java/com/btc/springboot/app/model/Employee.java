package com.btc.springboot.app.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee_data")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	@Id @GeneratedValue
	private int id; 
	private String employeeName;
	private String email;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dob;
	
}
