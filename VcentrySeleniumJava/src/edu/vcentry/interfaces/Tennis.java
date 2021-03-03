package edu.vcentry.interfaces;

import java.util.LinkedList;
import java.util.List;

public class Tennis implements Sports, Majors{

	@Override
	public void winner() {
		System.out.println("Player winning 3 out of 5 sets");
	}

	@Override
	public void tie() {
		System.out.println("Tie is not possible");
	}
	
	public void type() {
		System.out.println("Its not a team sport - Its an Individual Sport");
	}
	
	@Override
	public void isOlympicSport() {
		System.out.printf("This is a olympic sport - %b\n ", Sports.IS_OLYMPIC_SPORT);
	}

	@Override
	public List<String> majors() {
		List<String> majors = new LinkedList<String>();
		majors.add("AO");
		majors.add("FO");
		majors.add("USO");
		majors.add("Wimbledon");
		return majors;
	}

	@Override
	public void weLoveSport() {
		System.out.println("We love Tennis");
	}
	
	//public abstract void test();
}
