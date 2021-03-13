package com.vcentry.batch165.interfaces;

public interface Sports {
	
	public static final boolean IS_OLYMPIC_SPORT = true;
	boolean IS_NOT_OLYMPIC_SPORT = false;
	
	public void winner();
	
	public void tie();
	
	public boolean isOlympicSport();
	
	default void isAudienceAllowed() {
		System.out.println("Due to Covid-19, spectators are not allowed");
	}
	
	static void weLoveSport() {
		System.out.println("We love Sport");
	}
	
}
