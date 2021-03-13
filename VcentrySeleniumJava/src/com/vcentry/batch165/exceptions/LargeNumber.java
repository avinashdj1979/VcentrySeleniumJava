package com.vcentry.batch165.exceptions;

public class LargeNumber {
	public static void main(String args[]) { 		
			try {
				checkNumber(102);
			} catch (MyLargeNumberException e) {
				e.printStackTrace();
			}
	}
	
	public static void checkNumber(int number) throws MyLargeNumberException  {
		if(number > 100) {
			throw new MyLargeNumberException();
		} else {
			System.out.println("Valid Number");
		}
	}
}
