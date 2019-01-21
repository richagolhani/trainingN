package com.psl.model;

public class Circle extends Shape{

	private double radius;
	public Circle(double radius){
		super("Circle");
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void calculateArea()
	{
		setArea(Math.PI*getRadius()*getRadius());
	}
	public void calculatePerimeter(){
		setPerimeter(2*Math.PI*getRadius());

	}
	public void calculateVolume(){
		System.out.println("no volume");
	}
}
