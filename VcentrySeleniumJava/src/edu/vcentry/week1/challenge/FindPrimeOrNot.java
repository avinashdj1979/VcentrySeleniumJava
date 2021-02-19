package edu.vcentry.week1.challenge;

public class FindPrimeOrNot {

	public static void main(String[] args) {
		System.out.println(isPrime(15));
	}

	public static boolean isPrime(int number) {

		boolean isPrimeNumber = true;

		if (number == 1) {
			isPrimeNumber = false;
			return isPrimeNumber;
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}

		return isPrimeNumber;
	}

}
