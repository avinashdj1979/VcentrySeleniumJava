package edu.vcentry.classes.class13composition;

public class Monitor {
	
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;
	
	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixel(int x, int y, String color) {
		System.out.println(String.format("Drawing at %d and %d postion with color %s", x, y, color));
	}
	
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getSize() {
		return size;
	}
	public Resolution getNativeResolution() {
		return nativeResolution;
	}

}
