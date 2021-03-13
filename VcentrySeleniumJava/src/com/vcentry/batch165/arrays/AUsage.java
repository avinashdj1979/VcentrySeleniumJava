package com.vcentry.batch165.arrays;

public class AUsage {

	public static void main(String[] args) {
		A aObj = new A(2, 3);
		A bObj = aObj;
		bObj.a = 23;
		System.out.println(aObj.a);
	}

}
