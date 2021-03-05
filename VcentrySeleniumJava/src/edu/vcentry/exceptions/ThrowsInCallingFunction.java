package edu.vcentry.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsInCallingFunction {
	public static void main(String args[]) {
		try {
			createFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am printed");
	}
	
	public static void createFile() throws FileNotFoundException {
		File file = new File("abc.txt");
		FileReader fr = new FileReader(file);
		System.out.println("Exception successfully caught");
	}
}
