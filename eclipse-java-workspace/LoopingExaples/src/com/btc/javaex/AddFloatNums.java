package com.btc.javaex;

import java.util.Scanner;

public class AddFloatNums {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		float num,sum=0F;
		for(int counter=0;counter<5;counter++) {
			System.out.println("ENTER A NUMBER");
			num=scanner.nextFloat();
			sum+=num;
		}
		System.out.println("Sum = "+(int)sum);
		

	}

}
