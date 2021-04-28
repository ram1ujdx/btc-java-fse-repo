package com.btc.javaex;

public class PersonApp {

	public static void main(String[] args)throws Exception {
		
		Person p1=new Person();
		Person p2=new Person();
		p1.setPersonDetails("Tushar", 25, 5436562, "tushar@yahoo.com");
		p1.showPersonDetails();
		
		p2.setPersonDetails("Mahesh",28,854656213L,"mahesh@gmail.com");
		p2.showPersonDetails();
		
		

	}

}
