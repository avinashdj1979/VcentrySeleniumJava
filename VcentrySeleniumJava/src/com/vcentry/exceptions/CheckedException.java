package com.vcentry.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
	
	public static void main(String[] agrs) {
		handleFileCaller();
	}
	
	public static void handleFileCaller() {
		handleFile();
	}
	
	public static void handleFile() {
		File file = new File("abc.txt");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Successfully Caught!!!");
	}

}
