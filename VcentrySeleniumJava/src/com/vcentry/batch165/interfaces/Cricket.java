package com.vcentry.batch165.interfaces;

public class Cricket implements Sports{

	@Override
	public void winner() {
		System.out.println("Team scoring more runs");
	}

	@Override
	public void tie() {
		System.out.println("Teams score are level");
	}

	@Override
	public boolean isOlympicSport() {
		return  Sports.IS_NOT_OLYMPIC_SPORT;
	}
	
	public void isAudienceAllowed() {
		System.out.println(" 50% capacity is allowed");
	}
}
