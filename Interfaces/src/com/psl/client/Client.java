package com.psl.client;

public class Client {

	public static void main(String[] args) {
		driveVehichle(new Airplane());
		driveVehichle(new Truck());
		final double PI=3.14;
		
	}
	public static void driveVehichle(Drivable d){
		d.accelerate();
		d.steer();
	}
}
