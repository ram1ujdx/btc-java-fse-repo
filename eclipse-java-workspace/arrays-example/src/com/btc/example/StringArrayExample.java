package com.btc.example;

import java.util.Scanner;

public class StringArrayExample {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String []names=new String[5];
	
		System.out.println("Enter 5 Names: ");
		for(int i=0;i<names.length;i++) {
			names[i]=scan.next()+scan.nextLine();
		}
		System.out.println("Entered Names are - ");
		for(String s:names) {
			System.out.print(s+"  |  ");
		}
		
		

	}

}
