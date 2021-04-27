package com.btc.javaex;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int month;
		System.out.println("Enter month(in number): ");
		month=scanner.nextInt();
		switch(month) {
		case 2:
			System.out.println("February");
			break;
		case 1:
			System.out.println("January");
			break;
		case 3:
			System.out.println("March");
			break;
		
			
			
		default:
			System.out.println("Invalid Month Entered");
			break;
		}
		
		
//		if(month==1) {
//			System.out.println("January");
//		}
//		else if(month==2) {
//			System.out.println("February");
//		}
//		else if(month==3) {
//			System.out.println("March");
//		}
//		// ....
//		// ....
//		else {
//			System.out.println("Invalid Month Entered");
//		}
//		
		
	}
	
}

/*
switch(var){
	case value 1:
		.....
		break;
	case value 2:
		...
		break;
	...
	...
	default:
		...
		break;
	}		


*/