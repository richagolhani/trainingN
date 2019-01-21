package com.psl.model;

public class Sphere extends Shape {

	private double radius;

	public Sphere(double radius) {
		super("Sphere");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void calculateArea()
	{
		setArea(4*Math.PI*getRadius()*getRadius());
	}
	public void calculateVolume(){
		setVolume(4/3*Math.PI*getRadius() *getRadius() *getRadius());
	}
	
	public void calculatePerimeter(){}
}
