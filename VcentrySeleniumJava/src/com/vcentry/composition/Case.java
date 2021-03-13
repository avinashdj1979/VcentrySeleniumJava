package com.vcentry.composition;

public class Case {
	
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimension dimension;
	
	public Case(String model, String manufacturer, String powerSupply, Dimension dimension) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimension = dimension;
	}
	
	public void powerOn() {
		System.out.println("PC powered on");
	}
	
	public void powerOff() {
		System.out.println("PC powered off");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimension getDimension() {
		return dimension;
	}
	
	
}
