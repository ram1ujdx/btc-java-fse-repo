package com.btc.example;

public class MethodsWithArgs {

	public static void main(String[] args) {
		
		ArgsMethod m1 = (x,y,z)->System.out.println(x+y+z);
		
		m1.fun(5, 6, 7);

	}

}

interface ArgsMethod{
	void fun(int a, int b, int c);
}
