package com.btc.javaex.person;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Person {
	
	public static String country;
	static int count=0;
	private String personName;
	private int age;
	private long phone;
	private String email;
	
	public Person(){
		count++;
		System.out.println("Object Created with Default Constructor.. Total = "+count);
		
	}
	
	public Person(String personName, int age, long phone, String email) {
		count++;
		System.out.println("Object Created with Parameterized Constructor.. Total = "+count);
		this.personName=personName;
		this.age=age;
		this.phone=phone;
		this.email=email;
	}
	
	
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
		System.out.println("Country - "+country);
	}
	
	public void setPersonDetails(String personName, int age, long phone, String email){
		this.personName=personName;
		this.age=age;
		this.phone=phone;
		this.email=email;
		
	}
	
	public void sayHello() {
		
		System.out.println("Hello from "+country);
	}
	
	public void sayHello(int number) {
		System.out.println("Hello... Number give is "+number);
	}
	
	public void sayHello(String message) {
		
		System.out.println(message);
	}
	public String sayHello(String message, String language) {
		System.out.println(message+" "+language+" Programming");
		return "Country : "+country+" | Language : "+language;
	}
	
	
}
