package com.psl.client;

import java.io.Serializable;

import com.psl.client.FuelType;

public class Engine implements Serializable{
	

	private static final long serialVersionUID = 5792721057697892710L;
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
