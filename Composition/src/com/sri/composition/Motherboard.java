package com.sri.composition;

public class Motherboard {
	
	private String model;
	private String manufacturer;
	private int ramslots;
	private int cardslots;
	private String bios;
	
	
	public Motherboard(String model, String manufacturer, int ramslots, int cardslots, String bios) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramslots = ramslots;
		this.cardslots = cardslots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName) {
		System.out.println("program" + programName + "is now loading" );
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


	public int getRamslots() {
		return ramslots;
	}


	public void setRamslots(int ramslots) {
		this.ramslots = ramslots;
	}


	public int getCardslots() {
		return cardslots;
	}


	public void setCardslots(int cardslots) {
		this.cardslots = cardslots;
	}


	public String getBios() {
		return bios;
	}


	public void setBios(String bios) {
		this.bios = bios;
	}


	
	
	

}
