package com.vcentry.composition;

public class PC {
	
	private Monitor monitor;
	private MotherBoard motherBoard;
	private Case theCase;
	
	public PC(Monitor monitor, MotherBoard motherBoard, Case theCase) {
		this.monitor = monitor;
		this.motherBoard = motherBoard;
		this.theCase = theCase;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public MotherBoard getMotherboard() {
		return motherBoard;
	}

	public Case getTheCase() {
		return theCase;
	}
	
	public void usePC() {
		theCase.powerOn();
		motherBoard.loadProgram("Windows");
		monitor.drawPixel(2, 3, "Yellow");
		theCase.powerOff();
	}

}
