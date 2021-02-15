package com.vcentry.loops;

public class IsPrimeOrNot {

	public static void main(String[] args) {
//		int myNum = 12;
//		boolean isPrime = isPrime(myNum);
//		System.out.println(String.format("%s is Prime - %s", myNum, isPrime ));
		
		/*
		 * Print first five prime numbers between 0 to 100
		 */
		int count = 0;
		for (int i = 10; i < 100; i++) {
			boolean isPrime = isPrime(i);
			if (isPrime) {
				if (count >= 5) {
					break;
				}
				System.out.println(String.format("%s is Prime - %s", i, isPrime));
				count += 1;
			}

		}
	}

	public static boolean isPrime(int myNum) {
		boolean isPrime = true;

		if (myNum <= 1) {
			isPrime = false;
		}

		for (int i = 2; i < Math.sqrt(myNum); i++) {
			if (myNum % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

}
