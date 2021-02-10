package edu.vcentry.seljava.challenge;

public class PrintSeriesOfOddOrEven {
	
	public static void main(String[] arg) {
		
		printSeries(5, 10, "Odd");
	}
	
	public static void printSeries(int toBePrinted, int startNumber, String oddOrEven) {
		
		int counter = 1;
		for(int i = 0; i <= 1000; i++) {
			if(i <= startNumber) {
				continue;
			}
			
			if(counter > toBePrinted) {
				break;
			}
			
			if(oddOrEven.equals("Odd")) {
				if(i % 2 == 1) {
					System.out.println("Number : " + i);
					counter ++;
				}
			} else {
				if(i % 2 == 0) {
					System.out.println("Number : " + i);
					counter ++;
				}
			}
		}
	}

}
