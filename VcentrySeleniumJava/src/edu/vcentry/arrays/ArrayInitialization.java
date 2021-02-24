package edu.vcentry.arrays;

public class ArrayInitialization {
	
	public static void main(String[] args) {
			myFirstArray();
	}
	
	public static void myFirstArray() {
		int[] myFirstIntArray = new int[5];
		myFirstIntArray[0] = 5;
		
		System.out.println(myFirstIntArray[0]);
		
		double[] myDoubleArray = {1.0 , 2.0, 3.0, 4.44, 5.44};
		
		System.out.println(myDoubleArray[3]);
		
		String[] myStringArray = new String[3];
		
		//The below line is not allowed array constants can be used only as initializer
		//myStringArray = {"one", "two", "three"};
		
		// Not allowed we must provide the dimension of an array.
		//char[] myCharArray = new char[];
		
	}
}
