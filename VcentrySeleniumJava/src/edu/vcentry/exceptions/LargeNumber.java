package edu.vcentry.exceptions;

public class LargeNumber {
	public static void main(String args[]) {
		try {
			checkNumber(102);
		} catch (LargeNumberException e) {
			e.printStackTrace();
		}
	}
	
	public static void checkNumber(int number) throws LargeNumberException {
		if(number > 100) {
			throw new LargeNumberException();
		} else {
			System.out.println("Valid Number");
		}
	}
	
	public static void checkNumberWoException(int number) throws LargeNumberException {
		if(number > 100) {
			System.out.println("the Number is invalid");
		} else {
			System.out.println("Valid Number");
		}
	}
}
