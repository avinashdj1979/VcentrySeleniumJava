package edu.vcentry.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
	public static void main(String args[]) {
		createFile();
	}
	
	public static void createFile() {
		File file = new File("abc.txt");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File Not Found");
		}
		System.out.println("Exception successfully caught");
	}
}
