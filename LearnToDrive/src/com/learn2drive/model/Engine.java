package com.learn2drive.model;

import com.learn2drive.util.FuelType;

public class Engine {

	private double horsePower;
	private int cubicCapacity;
	private FuelType fueltype;
	
	
	
	public Engine(double horsePower, int cubicCapacity, FuelType fueltype) {
		super();
		this.horsePower = horsePower;
		this.cubicCapacity = cubicCapacity;
		this.fueltype = fueltype;
	}
	public double getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}
	public int getCubicCapacity() {
		return cubicCapacity;
	}
	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	public FuelType getFueltype() {
		return fueltype;
	}
	public void setFueltype(FuelType fueltype) {
		this.fueltype = fueltype;
	}
	
	
}
