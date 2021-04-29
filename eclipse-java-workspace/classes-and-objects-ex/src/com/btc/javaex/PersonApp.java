package com.btc.javaex;

import com.btc.javaex.person.Person;

public class PersonApp {

	public static void main(String[] args) {
		
		
		Person p1=new Person("Mahesh",28,854656213L,"mahesh@gmail.com");
	
		Person.country="India";
		p1.sayHello();
		p1.sayHello(10);
		p1.sayHello("Welcome to Java Programming");
		String output=p1.sayHello("Lets code in ", "Java");
		System.out.println(output);
		p1.showPersonDetails();
//		
		

	}

}
