package com.btc.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TraineeCollectionsEx {

	public static void main(String[] args) {
		
		Set<Trainee> trainees=new HashSet<>();
		Trainee trainee1=new Trainee("Rahul", 154651333L, 25);
		Trainee trainee2=new Trainee("Mahesh", 654651333L, 26);
		Trainee trainee3=new Trainee("Lokesh", 235651333L, 24);
		Trainee trainee4=new Trainee("Lokesh", 235651333L, 24);
		
		trainees.add(trainee1);
		trainees.add(trainee2);
		trainees.add(trainee3);
		trainees.add(trainee4);
		
		//Collections.sort(trainees, (t1,t2)-> t2.getAge()-t1.getAge());
		
		for(Trainee trainee:trainees) {
			System.out.println(trainee);
		}
		
		System.out.print("ENTER TRAINEE NAME : ");
		String traineeName=new Scanner(System.in).nextLine();
		Trainee trainee=findTraineeByName(trainees, traineeName);
		System.out.println(trainee);
		
//		Comparator<Trainee> compareByAgeReverse= (t1,t2)-> t2.getAge()-t1.getAge();

	}

	static Trainee findTraineeByName(Set <Trainee> trainees, String name) {
		
		for(Trainee trainee:trainees) {
			if(trainee.getName().equals(name)) {
				return trainee;
			}
		}
		return null;
		
	}
	
}


class CompareByAge implements Comparator<Trainee>{
	@Override
	public int compare(Trainee t1, Trainee t2) {
		return t1.getAge()-t2.getAge();
	}
	
}




class CompareByName implements Comparator<Trainee>{
	@Override
	public int compare(Trainee t1, Trainee t2) {
		return t1.getName().compareTo(t2.getName());
	}
}
