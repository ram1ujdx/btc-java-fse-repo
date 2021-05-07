package com.btc.example;

public class DivideNums {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		int arr[]= {5,6,0,4};
//		System.out.println("x = "+x);
//		System.out.println("y = "+y);
		System.out.println("Trying to Divide..");
		try {
			int result=arr[1]/arr[5];
			System.out.println("Result = "+result);
			
			
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid Array Index");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Done..");
		System.out.println("Bye...");
		
		

	}

}
