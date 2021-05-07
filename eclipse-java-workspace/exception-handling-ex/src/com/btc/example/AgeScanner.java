package com.btc.example;

public class AgeScanner {

	public void printAge(int age) throws NegativeNumberException {
		if(age<0) {
			throw new NegativeNumberException("Age Cannot be Negative");
		}
		System.out.println("Age = "+age);
	}
	
	
}
