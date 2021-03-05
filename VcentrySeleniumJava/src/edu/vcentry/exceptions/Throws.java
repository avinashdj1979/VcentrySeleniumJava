package edu.vcentry.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
	public static void main(String args[]) throws FileNotFoundException {
		createFile();
	}
	
	public static void createFile() throws FileNotFoundException {
		File file = new File("abc.txt");
		FileReader fr = new FileReader(file);
		System.out.println("Exception successfully caught");
	}
}
