package com.btc.example;

public interface HelloInterface {

	String sayHello(String name);

	default void sayBye() {
		System.out.println("Bye...");
	}

}
