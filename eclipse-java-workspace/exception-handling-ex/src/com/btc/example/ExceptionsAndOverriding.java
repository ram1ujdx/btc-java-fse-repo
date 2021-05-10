package com.btc.example;

import java.io.IOException;

class Parent{
	void show() throws Exception {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	@Override
	void show()  {
		System.out.println("Child");
	}
}


public class ExceptionsAndOverriding {

}
