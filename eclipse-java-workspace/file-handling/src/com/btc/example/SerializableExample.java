package com.btc.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializableExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//  	Serialization
		
//		Employee emp=new Employee(1001, "Tushar", 35000F);
//		
//		OutputStream out=new FileOutputStream("employee.txt");
//		ObjectOutputStream outputStream=new ObjectOutputStream(out);
//		outputStream.writeObject(emp);
//		
//		outputStream.close();
//		out.close();
		

//  	De-serialization	
		
		
		InputStream inputStream=new FileInputStream("employee.txt");
		ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
		
		Employee emp=(Employee)objectInputStream.readObject();
		
		System.out.println(emp);
		
		objectInputStream.close();
		inputStream.close();
		
		
		

	}

}
