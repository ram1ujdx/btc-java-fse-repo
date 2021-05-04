package com.btc.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Trainee> trainees=new HashMap<>();
		
		Trainee trainee1=new Trainee("Rahul", 154651333L, 25);
		Trainee trainee2=new Trainee("Mahesh", 654651333L, 26);
		Trainee trainee3=new Trainee("Lokesh", 235651333L, 24);
		
		trainees.put(trainee1.getName(), trainee1);
		trainees.put(trainee2.getName(), trainee2);
		trainees.put(trainee3.getName(), trainee3);
		
		System.out.print("ENTER TRAINEE NAME : ");
		String traineeName=new Scanner(System.in).nextLine();
		Trainee trainee=trainees.get(traineeName);
		System.out.println(trainee);
		
		
	}

}
