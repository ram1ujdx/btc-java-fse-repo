package com.btc.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SchoolMarksExercise {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		Map<Integer, Float> marks = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter Regno and Marks : ");
			int regno = scan.nextInt();
			float m = scan.nextFloat();
			marks.put(regno, m);
		}

		Map<Integer, String> medals = getMedals(marks);
		medals.forEach((s, m) -> System.out.println("Reg no. : " + s + "  --  " + m));

	}

	public static Map<Integer, String> getMedals(Map<Integer, Float> marks) {

		Map<Integer, String> medals = new HashMap<>();
		marks.forEach((id, m) -> {
			if (m >= 90) {
				medals.put(id, "Gold");
			} else if (m >= 80) {
				medals.put(id, "Silver");
			} else if (m >= 70) {
				medals.put(id, "Bronze");
			}
		});

		return medals;

	}

}
