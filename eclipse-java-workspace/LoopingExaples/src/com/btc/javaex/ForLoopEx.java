package com.btc.javaex;

public class ForLoopEx {

	public static void main(String[] args) {
		
//		for (int counter = 10; counter <= 5; counter++) {
//			System.out.println("Rahul... Printed ");
//		}
		
// For as Exit Controlled Loop		
		for (int counter=1;;counter++) {
			System.out.println("Rahul... Printed : "+counter);
			if(counter>5) {
				break;
			}
		}

	}

}
