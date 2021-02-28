package edu.vcentry.interfaces;

public class Cricket implements Sports{

	@Override
	public void winner() {
		System.out.println("Team scoring more runs is the winner");
	}

	@Override
	public void tie() {
		System.out.println("Game is tied when the team's runs are same.");
	}

	@Override
	public boolean isOlympicSport() {
		return Sports.IS_NOT_OLYMPIC_SPORT;
	}
	
	static void prizeMoney() {
		System.out.println("1 Lakh Ruppee");
	}

}
