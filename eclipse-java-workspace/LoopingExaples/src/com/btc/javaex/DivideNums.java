package com.btc.javaex;

import java.util.Scanner;

public class DivideNums {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		float num1,num2;
		double result;
		System.out.println("Enter two numbers: " );
		num1=scanner.nextFloat();
		num2=scanner.nextFloat();
 
		result=num1/num2;
		System.out.println("Result -> "+result);
		
		

	}

}
