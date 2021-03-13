package com.vcentry.batch165.interfaces;

import java.util.LinkedList;
import java.util.List;

public class Tennis implements Sports, Majors{

	@Override
	public void winner() {
		System.out.println("Who wins 3 out of 5 sets");
	}

	@Override
	public void tie() {
		System.out.println("No possibility of a tie");
	}

	@Override
	public boolean isOlympicSport() {
		return Sports.IS_OLYMPIC_SPORT;
	}

	@Override
	public List<String> majors() {
		List<String> majorsList = new LinkedList<String>();
		majorsList.add("AO");
		majorsList.add("FO");
		majorsList.add("Wimbledon");
		majorsList.add("US Open");
		return majorsList;
	}

}
