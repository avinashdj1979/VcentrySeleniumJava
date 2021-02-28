package edu.vcentry.interfaces;

public interface Sports {
	/*
	 *  By default all methods access modifier in an interface or public
	 *  All Variables in any public static final
	 */
	
	public static final boolean IS_OLYMPIC_SPORT = true;
	boolean IS_NOT_OLYMPIC_SPORT = false;

	
	void winner();
	
	void tie();
	
	boolean isOlympicSport();
	
	default void type() {
		System.out.println("Its a team Sport mostly");
	}
	
	static void PrizeMoney() {
		System.out.println("Winning team gets Cash Prize");
	}

}
