package edu.vcentry.classes.class13composition;

public class Case {
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimensions;
	
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	
	public void powerOn() {
		System.out.println("Switch on the Power");
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

	public Dimensions getDimensions() {
		return dimensions;
	}
	
	

}
