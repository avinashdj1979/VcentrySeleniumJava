package edu.vcentry.loops;

public class WhileLoop {

	public static void main(String[] args) {
		printHelloSeries(5, 10, "Hello");
	}

	public static void printHelloSeries(int numberOfTimes, int newCounter, String whatToPrint) {

		int k = 0;

		while (k < numberOfTimes) {
			System.out.println("counter" + k + ":  " + whatToPrint);
			k = k + 1;
		}

		System.out.println("counter" + k + ":  " + whatToPrint);
		k = k + 1;
	}


	public static void printHelloSeries(int counter, int newCounter) {
		String whatToPrint = "Local";
		printHelloSeries(counter, newCounter, whatToPrint);
	}
}
