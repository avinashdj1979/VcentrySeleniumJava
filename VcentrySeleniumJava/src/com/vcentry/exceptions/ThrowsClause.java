package com.vcentry.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsClause {
	
	public static void main(String[] agrs) {
		handleFileCaller2();
	}
	
	public static void handleFileCaller2() {
		handleFileCaller1();
		System.out.println("Successfully Caught!!! in handleFileCaller2()");
	}
	
	public static void handleFileCaller1(){
		handleFile();
		System.out.println("Successfully Caught!!! in handleFileCaller1()");
	}
	
	public static void handleFile() {
		File file = new File("abc.txt");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException dhans) {
			System.err.println("File not found");
			dhans.printStackTrace();
		}
		System.out.println("Successfully Caught in handleFile()!!!");
	}

}
