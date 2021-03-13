package com.myclass.statics.challenge;

public class A {
	private static int counter;
	
	public A(){
		counter = counter + 1;
	}
	
	public static int getCounter() {
		return counter;
	}
	
}
