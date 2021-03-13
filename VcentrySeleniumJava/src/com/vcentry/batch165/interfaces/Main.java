package com.vcentry.batch165.interfaces;

public class Main {

	public static void main(String[] args) {

		Sports cricket = new Cricket();
		
		//Majors majors = new Cricket(); Cricket class does not implement Majors.
		
		getClassDetails(cricket);
		decorator();
		cricket.winner();
		cricket.tie();
		System.out.println("Is olympic sport - " + cricket.isOlympicSport());
		cricket.isAudienceAllowed();
		Sports.weLoveSport();
		decorator();
		
		Sports tennis = new Tennis();
		
		Majors tennis2 = new Tennis();
		
		getClassDetails(tennis);
		decorator();
		tennis.winner();
		tennis.tie();
		System.out.println("Is olympic sport - " + tennis.isOlympicSport());
		//tennis.majors(); // tennis is Sports during Compile time and Sports does not have majors() method.
		System.out.println(tennis2.majors());
		tennis.isAudienceAllowed();

	}
	
	private static void decorator() {
		System.out.println("************");
	}

	private static void getClassDetails(Object obj) {
		System.out.println(obj.getClass().getSimpleName());
	}

}
