package com.btc.example;

public class GenericExample{
	
	public static void main(String[] args) {
		Generics<Integer,ListExample> g1=new Generics<>();
		
		int result=g1.doSomething(100);
		
		Generics<String,Integer> s1=new Generics<>();
		
		String str=s1.doSomething("Mahesh");
		
	}
	
}

class Generics<t1,t2> {

	public t1 doSomething(t1 data) {
		//.....
		return data;
	}
}
	
	
