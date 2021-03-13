package com.myclass.statics.challenge;

public class Main {
		public static void main(String args[]) {
			for(int i =0; i < 100; i++) {
				new A();
			}
			
			System.out.println("Objects created = " + A.getCounter());
			
		}
}
