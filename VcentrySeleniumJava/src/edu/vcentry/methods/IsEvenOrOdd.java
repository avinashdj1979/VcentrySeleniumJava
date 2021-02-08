package edu.vcentry.methods;

public class IsEvenOrOdd {

	public static void main(String[] args) {
		int number = 7;
//		String type = isEvenOrOdd(number);
//		System.out.println("My Number " + number + " is " + type );
//		System.out.println("My Number " + number + " is " + isEvenOrOdd(number) );
//		
		boolean isEven = isEvenOrOddBoolean(number);
		System.out.println("Is my Number is even?  " + isEven );
	}
	
	public static String isEvenOrOdd(int num) {
		String type = "odd";
		if(num % 2 == 0) {
			type = "even";
		}
		//String type = (num % 2 == 0) ? "Even" : "Odd";
		return type;
	}
	
	public static boolean isEvenOrOddBoolean(int num) {
//		boolean isEven = false;
//		if(num % 2 == 0) {
//			isEven = true;
//		}
//		return isEven;
		
		if(num % 2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}

}
