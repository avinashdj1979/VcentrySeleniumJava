package com.vcentry.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsClause2 {
	
	public static void main(String[] agrs)  throws FileNotFoundException{
		handleFileCaller2();
	}
	
	public static void handleFileCaller2()  throws FileNotFoundException{
		handleFileCaller1();
		System.out.println("Successfully Caught!!! in handleFileCaller2()");
	}
	
	public static void handleFileCaller1() throws FileNotFoundException {
		handleFile();
		System.out.println("Successfully Caught!!! in handleFileCaller1()");
	}
	
	public static void handleFile() throws FileNotFoundException {
		File file = new File("abc.txt");
		FileReader fr = new FileReader(file);
		System.out.println("Successfully Caught in handleFile()!!!");
	}

}
