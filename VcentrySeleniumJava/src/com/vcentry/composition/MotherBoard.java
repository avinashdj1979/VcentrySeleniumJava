package com.vcentry.composition;

public class MotherBoard {
	
	private String model;
	private String manufacturer;
	int ramSlots;
	int cardSlots;
	String biosVersion;
	
	public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String biosVersion) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.biosVersion = biosVersion;
	}
	
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public int getCardSlots() {
		return cardSlots;
	}



	public String getBiosVersion() {
		return biosVersion;
	}

	public void loadProgram(final String programName) {
		System.out.println("Loading Program ... " + programName);
	}
}
