package com.btc.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListExample {

	public static void main(String[] args) {
		
		Set<String> items=new TreeSet<>();
		
		items.add("Rahul");
		items.add("Tushar");
		items.add("Umang");
		items.add("Tushar");
		items.add("Trisha");
		items.add("Abhi");
		items.add("Tushar");
		System.out.println("Original List : ");
	
		
		
		for(String item:items) {
			System.out.println(item.toUpperCase());
		}
		
//		items.remove(2);
//		System.out.println("After Deleting : ");
//		for(String item:items) {
//			System.out.println(item);
//		}
		
//		for(int i=0;i<items.size();i++) {
//			System.out.println(items.get(i));
//		}
		
		
		
		
	}
	
}
