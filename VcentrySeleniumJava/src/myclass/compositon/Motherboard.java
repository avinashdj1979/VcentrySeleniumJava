package myclass.compositon;

public class Motherboard {
	private String manufacturer;
	private String model;
	private int cardSlots;
	private int ramSlots;
	private String biosVersion;
	
	public Motherboard(String manufacturer, String model, int cardSlots, int ramSlots, String biosVersion) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.cardSlots = cardSlots;
		this.ramSlots = ramSlots;
		this.biosVersion = biosVersion;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public String getBiosVersion() {
		return biosVersion;
	}
}
