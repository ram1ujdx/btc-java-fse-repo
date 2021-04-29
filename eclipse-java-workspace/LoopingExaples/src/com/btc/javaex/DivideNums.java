package com.btc.javaex;

import java.util.Scanner;

public class DivideNums {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		float num1,num2;
		double result;
		num1=Float.parseFloat(args[0]);
		num2=Float.parseFloat(args[1]);
 
		result=num1/num2;
		System.out.println("Result -> "+result);
		
		

	}

}
