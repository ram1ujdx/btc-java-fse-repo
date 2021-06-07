package com.btc.jpa.app.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "person_info")
public class Person {
	@Id
	private long id;
	
	@Column(name = "person_name", length = 50)
	private String personName;
	
	@Column(unique = true, nullable = false, length = 50)
	private String email;
	
	private LocalDate birthDate;

}
