package com.btc.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



public class FileOperations {

	private static FileInputStream inputStream;
	private static FileOutputStream outputStream;

	public static void main(String[] args) throws IOException {
		
//	// Reading Data
//		
//		inputStream = new FileInputStream("data.txt");
//		int ch;
//		while((ch=inputStream.read())!=-1) {
//			System.out.print((char)ch);
//		}
		
		
	//Writing Data
		
//		outputStream=new FileOutputStream("data2.txt");
//		String str="Hello World";
//		byte []chars=new byte[str.length()];
//		for(int i=0;i<str.length();i++) {
//			chars[i]=(byte)str.charAt(i);
//		}
//		outputStream.write(chars);
//		
//		outputStream.close();
		
		
//		BufferedReader reader=new BufferedReader(new FileReader("data.txt"));
////		String line;
////		while((line=reader.readLine())!=null) {
////		System.out.println(line);
////	}
//		
//		reader.lines().forEach(System.out::println);
		
//		BufferedWriter writer=new BufferedWriter(new FileWriter("data2.txt",true));
//		String lines="\n This is the second line";
//		
//		writer.write(lines);
//
//		writer.close();
		
		// Non Blocking IO
		
		Files.lines(Paths.get("data.txt")).forEach(System.out::println);
		
		
	}

}
