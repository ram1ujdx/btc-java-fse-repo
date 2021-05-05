package com.btc.example;

public class HelloMain {

	public static void main(String[] args) {
//		HelloInterface obj=new HelloClass();
//		obj.sayHello();
//		obj.sayBye();

//		HelloInterface obj2=new HelloInterface() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("Hello Coders...");
//			}
//		};
//		obj2.sayHello();

		HelloInterface obj3 = x->"Hello "+x;
			
		System.out.println(obj3.sayHello("Gaurav"));
		obj3.sayBye();

	}

}
