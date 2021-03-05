package edu.vcentry.interfaces;

public class Cricket implements Sports{

	@Override
	public void winner() {
		System.out.println("Team scoring more runs is the winner");
	}

	@Override
	public void tie() {
		System.out.println("Team scores are equal");
	}

	@Override
	public void isOlympicSport() {
		System.out.printf("This is a olympic sport - %b\n ", Sports.IS_NOT_OLYMPIC_SPORT);
	}

	@Override
	public void weLoveSport() {
		System.out.println("We love Cricket");
		
	}

}
