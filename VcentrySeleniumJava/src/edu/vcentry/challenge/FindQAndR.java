package edu.vcentry.challenge;

public class FindQAndR {

	public static void main(String[] args) {
		findQAndR(6, 2);
	}
	
	public static void findQAndR(int dividend, int divisor) {
			int q =0;
			int r = 0;
			
			while (dividend >= divisor) {
				dividend =dividend - divisor;
				q = q + 1;
			}
				r = dividend;
				
			System.out.println(String.format("Q: %d  and R: %d", q, r));
	}

}
