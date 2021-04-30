package com.btc.javax;

public class Parent {

	public Parent(String name) {
		this.name=name;
		System.out.println("Parent Constructor Created");
	}
	
	protected String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public void showName() {
		System.out.println("Parent Name = "+name);
	}
	
	
}
