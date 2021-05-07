package com.btc.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CheckedExceptionExample {

	public static void main(String[] args)throws FileNotFoundException  {
		InputStream fileInputStream = null;
		Scanner scan = null;
		
			System.out.println("Try Block");
			fileInputStream = new FileInputStream("hello1.txt");
			scan = new Scanner(fileInputStream);

			System.out.println(scan.nextLine());

//		}  finally {
//			System.out.println("Finally Block");
//			if (fileInputStream != null) {
//				fileInputStream.close();
//			
//			scan.close();
//			}
//		}

	}

}
