package edu.vcentry.loops;

public class ForLoop {

	public static void main(String[] args) {
		printHello();
	}
	
	public static void printHello() {
		for(int i = 1; i <= 3; i = i + 1) {
			System.out.println("The loop counter is " + i);
		}
	}

}
