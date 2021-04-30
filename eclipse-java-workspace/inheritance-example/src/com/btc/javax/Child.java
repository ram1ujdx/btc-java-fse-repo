package com.btc.javax;

public class Child extends Parent {

	String name;
	public Child(String parentName,String childName) {
		super(parentName);
		this.name=childName;
		System.out.println("Child Constructor Created");
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	
	public void setName(String parentName, String childName) {
		super.setName(parentName);
		this.setName(childName);
	}
	
	@Override
	public void showName() {
		super.showName();
		System.out.println("Child Name = "+this.name);
	}
}
