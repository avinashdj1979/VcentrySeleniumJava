package com.vcentry.interfaces;

public class Main {
	
	public static void main(String args[]) {
		
		Sports obj1 = new Cricket();
		
		//Majors m1 = new Cricket();

		getClassNameOfObject(obj1);
		decorator();
		obj1.winner();
		obj1.tie();
		obj1.type();
		obj1.isOlympicSport();
		obj1.weLoveSport();
		//obj1.isAudienceAllowed(); Cannot call static method with a reference variable
		System.out.println("Is Audience allowed during Covid-19 " + Sports.isAudienceAllowed());
		
		decorator();
		Sports obj2 = new Tennis();
		
		Majors mObj = new Tennis();
		
		getClassNameOfObject(obj2);
		decorator();
		obj2.winner();
		obj2.tie();
		obj2.type();
		obj2.isOlympicSport();
		obj2.weLoveSport();
		System.out.println(mObj.majors());
	}

	public static void decorator() {
		System.out.println("************");
	}
	
	private static void getClassNameOfObject(Object obj) {
		System.out.println(obj.getClass().getCanonicalName()); 
	}
}
