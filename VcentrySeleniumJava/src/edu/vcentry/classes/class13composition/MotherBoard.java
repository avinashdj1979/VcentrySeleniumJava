package edu.vcentry.classes.class13composition;

public class MotherBoard {
	public String model;
	public String manufacturer;
	public int cardSlots;
	public int ramSlots;
	public String bios;
	
	public MotherBoard(String model, String manufacturer, int cardSlots, int ramSlots, String biosVersion) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.cardSlots = cardSlots;
		this.ramSlots = ramSlots;
		this.bios = biosVersion;
	}
	
	public void loadProgram(final String programName) {
		System.out.println("Loading the program - " + programName);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public String getBiosVersion() {
		return bios;
	}
	
	

}
