package com.vcentry.interfaces;

public interface Sports  extends Love{
	
	public static final boolean IS_OLYMPIC_SPORT = true;
	boolean IS_NOT_OLYMPIC_SPORT = false;
	
	public void winner();

	public void tie();
	
	public void isOlympicSport();

	default void type(){
		System.out.println("It is a Team Sport");
	}
	
	static boolean isAudienceAllowed() {
		return false;
	}
}
