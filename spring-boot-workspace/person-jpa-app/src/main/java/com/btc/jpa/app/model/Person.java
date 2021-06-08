package com.btc.jpa.app.model;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "person_info")
@NamedQueries(
		{
			@NamedQuery(name = "findByEmail", query = "from Person where email=:email")
		}
		)
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "person_name", length = 50)
	private String personName;
	
	@Column(unique = true, nullable = false, length = 50)
	private String email;
	
	private LocalDate birthDate;
	
//	@OneToOne
//	private Laptop laptop;
	
	
	@OneToMany(mappedBy = "person")
	private List<Laptop> laptop;

	public Person(String personName, String email, LocalDate birthDate) {
		super();
		this.personName = personName;
		this.email = email;
		this.birthDate = birthDate;
	}

//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", personName=" + personName + ", email=" + email + ", birthDate=" + birthDate
//				+ "]";
//	}
	
	
	

}
