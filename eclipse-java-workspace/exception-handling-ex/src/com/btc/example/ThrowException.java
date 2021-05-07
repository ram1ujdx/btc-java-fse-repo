package com.btc.example;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args)  {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age - ");
		int age=scan.nextInt();
		try {
		if(age<0) {
			throw new Exception("Age Cannot be negative");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Hello... Youu are "+age);
		
		

	}

}
