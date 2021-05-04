// Exercise 13: Create a method which accepts a list of integer and removes all the duplicates in the list.
// and Return the resulting list in descending order


package com.btc.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Excecise13Solution {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(5,10,5,15,5,3,8,25);
		List<Integer> result=DuplicateRemover.removeDuplicates(list);
		System.out.println("Original List");
		System.out.println(list);
		System.out.println("Resulting List");
		System.out.println(result);

	}

}

class DuplicateRemover{
	
	public static List<Integer> removeDuplicates(List<Integer> list){
		
		Set<Integer> set=new TreeSet<>((i,j)->j-i);
		set.addAll(list);
		List<Integer> resultingList=new ArrayList<>(set);
		return resultingList;
	}
	
}
