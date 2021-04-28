package com.btc.javaex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Person {

	private String personName;
	private int age;
	private long phone;
	private String email;
	
	public void setAge(int age) {
		if(age>0) {
		this.age=age;
		}
	}
	
	public void showPersonDetails() {
		System.out.println("Name - "+personName);
		System.out.println("Age - "+age);
		System.out.println("Phone - "+phone);
		System.out.println("Email - "+email);
	}
	
	public void setPersonDetails(String personName, int age, long phone, String email){
		this.personName=personName;
		this.age=age;
		this.phone=phone;
		this.email=email;
		
	}
	
	
	
}
