package com.btc.example;

public class CalculatorApp {

	public static void main(String[] args) {
		
		float a=5, b=10;
		Calculator calc=new Calculator();
		
		Operation op= (x, y)->x+y;
		
		float addResult=calc.calculate(a, b, op);
		
		float subtractResult=calc.calculate(a, b, (x,y)->x-y);
		
		float sqSum=calc.calculate(a, b, (x,y)->(float)Math.pow((x+y),2));
												
		System.out.println(sqSum);
		
		

	}
	

}

interface Operation{
	float operate(float a, float b);
}


class Calculator{
	
	public float calculate(float a, float b, Operation op) {
		return op.operate(a, b);
	}
	
	
}


