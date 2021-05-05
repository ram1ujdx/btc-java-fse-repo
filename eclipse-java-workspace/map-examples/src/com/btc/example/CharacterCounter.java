package com.btc.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {

	public static void main(String[] args) {
		
		String str;
		
		System.out.println("Enter a string : ");
		str=new Scanner(System.in).nextLine();
		
		char []charArray=str.toCharArray();
		Map<Character, Integer> charMap=new HashMap<>();
		
		for(char ch:charArray) {
			if(charMap.containsKey(ch)) {
				int count=charMap.get(ch)+1;
				charMap.put(ch, count);
			}
			else {
				charMap.put(ch, 1);
			}	
		}
		
//		
//		for(char ch:charMap.keySet()) {
//			System.out.println(ch+" -> "+charMap.get(ch));
//		}
		
		charMap.forEach((k,v)->System.out.println(k+" -> "+v));
		

	}

}
