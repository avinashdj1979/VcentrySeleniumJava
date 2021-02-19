package edu.vcentry.loops;

public class PrintEvenOrOrddNumbers {

	public static void main(String[] args) {
		/*
		 * Uncomment and call if required
		 */
		//printSeries(10);
		//printSeries(30, 40);
		
		int startRange = 10;
		int endRange = 20;
		printSeries(10, 20, "EVEN");

	}

	public static void printSeries(int endRange) {
		printSeries(0, endRange);
	}

	public static void printSeries(int startRange, int endRange) {
		// Prints Even
		for (int i = startRange; i <= endRange; i++) {
			if (i % 2 == 0) {
				System.out.println("Number - " + i);
			}
		}
	}

	public static void printSeries(int startRange, int endRange, String evenOrOdd) {
		for (int i = startRange; i <= endRange; i++) {
			if(evenOrOdd == "EVEN") {
				if (i % 2 == 0)
				{
					System.out.println("Number - " + i);
				}
			} else {
				if (i % 2 != 0)
				{
					System.out.println("Number - " + i);
				}
			}

		}
		
//		if(evenOrOdd == "ODD") {
//		for (int i = startRange; i <= endRange; i++) {
//				if (i % 2 == 0) {
//					System.out.println("Number - " + i);
//				}
//			}
//		} else {
//			for (int i = startRange; i <= endRange; i++) {
//				if (i % 2 != 0) {
//					System.out.println("Number - " + i);
//				}
//			}
//		}
	}

}
