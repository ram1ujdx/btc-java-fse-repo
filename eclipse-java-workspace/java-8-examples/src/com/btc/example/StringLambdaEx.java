package com.btc.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StringLambdaEx {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Tushar","Ramesh","Javed","Lokesh","Arnav","Jack");
		
//		Consumer<String> consumer=new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//				
//			}
//		};
		
//		Consumer<String> consumer=s->System.out.println(s);
		
		
		//names.forEach(System.out::println);
		
		
		
		String result=names.stream()
												.map(String::toUpperCase)
													
												
												.filter(name->{
													System.out.println("Filter Passed -- Matched = "+ name.startsWith("K"));
													return name.startsWith("J");
													})
												
												.findFirst().orElse("Not Found");
		
		
		System.out.println(result);

	}

}
