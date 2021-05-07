package com.btc.example;

public class NullPointerExmaples {

	static Test obj;
	public static void main(String[] args) {
		
		
		
		if(obj==null) {
			System.out.println("Test object not created");
		}
		else {
			obj.show();
		}
		

	}

}

class Test{
	void show() {
		System.out.println("Hello..");
	}
}