package edu.vcentry.exceptions;

public class UnCheckedExceptionExample1 {
	public static void main(String args[]) {
		createFile();
	}
	
	public static void createFile() {
		int[] myArray = {1, 2, 3, 4};
		try {
			System.out.println(myArray[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("I am not printed");
	}
}
