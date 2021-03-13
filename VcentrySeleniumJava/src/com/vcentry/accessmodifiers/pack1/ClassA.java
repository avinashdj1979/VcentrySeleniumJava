package com.vcentry.accessmodifiers.pack1;

public class ClassA {
	
	private int myNum1;
	private int myNum2;
	
	public int getMyNum1() {
		return myNum1;
	}

	protected int getMyNum2() {
		return myNum2;
	}
	
	int getSum() {
		return myNum1 + myNum2;
	}
}
