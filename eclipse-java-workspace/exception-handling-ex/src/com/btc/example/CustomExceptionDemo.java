package com.btc.example;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		
		AgeScanner ageScanner=new AgeScanner();
		
		try {
			ageScanner.printAge(-10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
