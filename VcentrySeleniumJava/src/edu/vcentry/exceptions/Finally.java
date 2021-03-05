package edu.vcentry.exceptions;

public class Finally {
	public static void main(String args[]) {
		createFile();
	}
	
	public static void createFile() {
		int[] myArray = {1, 2, 3, 4};
		try {
			System.out.println(myArray[4]);
		} finally {
			System.out.println("Finally printed always");
		}
		System.out.println("I am not printed");
	}
}
