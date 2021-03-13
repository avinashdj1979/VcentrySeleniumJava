package myclass.compositon;

public class Case {
	
	private String manufacturer;
	private String model;
	private String powerSupply;
	private Dimension dimension;
	
	public Case(String manufacturer, String model, String powerSupply, Dimension dimension) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.powerSupply = powerSupply;
		this.dimension = dimension;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getPowerSupply() {
		return powerSupply;
	}
	
	public Dimension getDimension() {
		return dimension;
	}
}
