package com.btc.jpa.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Laptop {

	@Id @GeneratedValue
	long laptopId;
	
	private String brand;
	
	private int ram;
	
	@ManyToOne
	private Person person;

	public Laptop(String brand, int ram) {
		super();
		this.brand = brand;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", brand=" + brand + ", ram=" + ram + "]";
	}
	
	
	
	
	
}
