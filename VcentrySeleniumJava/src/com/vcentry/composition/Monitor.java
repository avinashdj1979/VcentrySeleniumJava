package com.vcentry.composition;

public class Monitor {
	
	private String model;
	private String manufacturer;
	private int size;
	private Resolution resolution;
	
	/**
	 * @param model
	 * @param manufacturer
	 * @param size
	 * @param resolution
	 */
	public Monitor(String model, String manufacturer, int size, Resolution resolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.resolution = resolution;
	}
	
	public void drawPixel(int x, int y, String color) {
		System.out.printf("Draw something from %d to %d using %s\n", x, y , color);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}
	
	
}
