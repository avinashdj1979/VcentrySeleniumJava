package edu.vcentry.loops;

import edu.vcentry.seljava.challenge.PrintSeriesOfOddOrEven;

public class WhileLoop {

	public static void main(String[] args) {
		// printHelloSeries(5, 10);
		printHelloSeries(1, 2);
		printHelloSeries(1, 2, "Hello");
	}

	public static void printHelloSeries(int numberOfTimes, int newCounter, String whatToPrint) {
		
		int k = 0;
		while (k < numberOfTimes) {
			System.out.println(whatToPrint);
			k = k + 1;
		}

		while (true) {
			if (k >= (newCounter)) {
				break;
			}
			System.out.println(whatToPrint);
			k = k + 1;
		}
	}

	public static void printHelloSeries(int counter, int newCounter) {
		String whatToPrint = "Local";
		printHelloSeries(counter, newCounter, whatToPrint);
	}
}
