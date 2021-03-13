package myclass.compositon;

public class Monitor {
	private String manufacturer;
	private String model;
	private int size;
	private Resolution resolution;

	public Monitor(String manufacturer, String model, int size, Resolution resolution) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.size = size;
		this.resolution = resolution;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public String getModel() {
		return model;
	}

	public int getSize() {
		return size;
	}

	public Resolution getResolution() {
		return this.resolution;
	}
}
