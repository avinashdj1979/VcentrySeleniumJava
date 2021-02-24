package edu.vcentry.classes.class13composition;

public class PC {
		
	private MotherBoard motherBoard;
	private Monitor monitor;
	private Case theCase;
	
	public PC(MotherBoard motherBoard, Monitor monitor, Case theCase) {
		this.motherBoard = motherBoard;
		this.monitor = monitor;
		this.theCase = theCase;
	}
	
	public void draw() {
		theCase.powerOn();
		motherBoard.loadProgram("Windows 10");
		monitor.drawPixel(10, 20, "Yellow");
	}

	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public Case getTheCase() {
		return theCase;
	}
	
	public int getCaseHeight() {
		return theCase.getHeight();
	}

}
