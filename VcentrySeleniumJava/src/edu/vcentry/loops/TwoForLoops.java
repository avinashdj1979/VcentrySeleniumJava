package edu.vcentry.loops;

public class TwoForLoops {
	public static void main(String args[]) {
		printSeries(5);
	}
	
	/*
	 1
	 1	2
	 1 2	3
	 1	2	3	4
	 1	2	3	4	5
	 */
	
	public static void printSeries(int maxNumber) {
		for(int i =1; i <= maxNumber; i++) {
			for(int k = 1; k <= i; k ++) {
				System.out.print(k);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
