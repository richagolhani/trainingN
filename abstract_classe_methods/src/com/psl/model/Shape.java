package com.psl.model;

public abstract class Shape extends Dimension {

	private String name;
	protected double area;
	private double perimeter;
	private double volume;


	public Shape(String name) {
		super(name);
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	public double getArea() {
		return area;
	}
	protected void setArea(double area) {
		this.area = area;
		
	}
	public double getPerimeter() {
		return perimeter;
	}
	protected void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	

	

	public abstract void calculateArea();
	public abstract void calculatePerimeter();
	public abstract void calculateVolume();
}
