package com.psl.model;

public class IsocelesTriangle extends Triangle{
	public IsocelesTriangle(double side1, double side2, double side3) {
		super(side1, side2, side3);
		// TODO Auto-generated constructor stub
	}
	public void calculateArea(){
		calculatePerimeter();
		double semiPerimeter=getPerimeter()/2;
		double area;
		area=Math.sqrt(semiPerimeter*(semiPerimeter-getSide1())*
				(semiPerimeter-getSide2())*
				(semiPerimeter-getSide3()));
		setArea(area);
	}

}
