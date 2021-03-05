package edu.vcentry.exceptions;

import java.io.FileNotFoundException;

public class MultipleCatch {
	public static void main(String args[]) {
		createFile();
	}
	
	public static void createFile() {
		int[] myArray = {1, 2, 3, 4};
		try {
			System.out.println(myArray[4]);
		} catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println("I am not printed");
	}
}
