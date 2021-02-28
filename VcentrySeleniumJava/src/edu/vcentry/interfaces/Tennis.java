package edu.vcentry.interfaces;

import java.util.ArrayList;

public class Tennis implements Sports, Majors {

	@Override
	public void winner() {
		System.out.println("Winner takes 3 out of 5 Sets");
	}

	@Override
	public void tie() {
		System.out.println("No Possibility of Tie. Tie Breakers are enforced");
	}

	@Override
	public boolean isOlympicSport() {
		//All fields of the interface are public static and final by default and value connot be modified.
		//Sports.IS_NOT_OLYMPIC_SPORT = true;
		return Sports.IS_OLYMPIC_SPORT;
	}
	
	public void type() {
		System.out.println("Its an individual Game");
	}

	ArrayList<String> majors = new ArrayList<String>();

	@Override
	public ArrayList<String> majors() {
		majors.add("Australian Open");
		majors.add("Wimbledon");
		majors.add("French Open");
		majors.add("US Open");
		
		return majors;
	}
	
	
}
