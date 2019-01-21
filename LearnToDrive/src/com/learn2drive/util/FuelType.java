package com.learn2drive.util;

public enum FuelType {

	PETROL(100),DIESEL(200),CNG(300);//
	
	private FuelType(int combustionTemperature){
		this.combustionTemperature= combustionTemperature;
	}
	
	private int combustionTemperature;

	public int getCombustionTemperature() {
		return combustionTemperature;
	}

	public void setCombustionTemperature(int combustionTemperature) {
		this.combustionTemperature = combustionTemperature;
	}
	
	
}
