package edu.vcentry.loops;

public class IsPrimeOrNot {

	public static void main(String[] args) {
			int myNum = 10;
			System.out.println("Is " + myNum + " Prime? " + isPrime(myNum));
	}

	public static boolean isPrime(int myNum) {
		
		boolean isPrime = true;
		
		if(myNum == 1) {
			return false;
		}
		
		for (int i = 2; i < Math.sqrt(myNum); i++) {
			if(myNum % i == 0) {
				//isPrime = false;
				//break;
				return false;
			}
		}
			
		return true;
	}
}
