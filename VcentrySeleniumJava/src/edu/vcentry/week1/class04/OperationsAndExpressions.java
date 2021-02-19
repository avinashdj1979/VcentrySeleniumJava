package edu.vcentry.week1.class04;

public class OperationsAndExpressions {

	public static void main(String[] args) {
		int myFirstNum = 2;
		int mySecNum = 4;
		
		int result = myFirstNum + mySecNum;
		
		System.out.println("2 + 4 = " + result);
		
		myFirstNum = 6;
		mySecNum = 4;
		
		result = result - mySecNum;
		
		System.out.println("6 - 4 = " + result);
		
		myFirstNum = 10;
		mySecNum = 20;
		
		result = result * mySecNum;
		
		System.out.println("2 * 20 = " + result);
		
		myFirstNum = 10;
		mySecNum = 2;
		
		result = result / mySecNum;
		
		System.out.println("40 / 2 = " + result);
		
		mySecNum = 3;
		
		result = result % mySecNum;
		
		System.out.println("20 % 2 = " + result);
		
		result = 2 % 20;
		
		System.out.println("Mansoor's Question :" + result);
		
		int intDivision = 5 / 2;
		
		System.out.println("Integer Division 5 / 2 = " + intDivision);
	 
		double dblDivision = 5d/2d;
		
		System.out.println("Double Division 5d/2d = " + dblDivision  );
	}

}
