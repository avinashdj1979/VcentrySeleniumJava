package edu.vcentry.methods;

public class IsEvenOrOdd1 {

	public static void main(String[] args) {

		boolean isMyNumEven = isEven(23);
		System.out.println("Is My Number Even? : " + isMyNumEven);
		

		String evenOrOdd = isEvenOrOdd(22);
		System.out.println("My Number is  " + evenOrOdd);

	}
	
	public static boolean isEven(final int myNumber) {
		if(myNumber % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String isEvenOrOdd(final int myNumber) {
		if(myNumber % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}
	

}
