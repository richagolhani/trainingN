package com.psl.client;

import com.psl.model.Rectangle;
import com.psl.model.Circle;
import com.psl.model.Shape;
import com.psl.model.Sphere;
import com.psl.model.Triangle;

public class Client {
public static void main(String[] args) {
	
	Rectangle r =new Rectangle(6,4);
	Circle c=new Circle(8);
	Triangle t=new Triangle(30,30,30);
	Sphere sp=new Sphere(30);
	
	c.setDim("2D");
	t.setDim("2D");
	r.setDim("2D");
	
	sp.setDim("3D");
	
	
	shapeManager(c);
	shapeManager(t);
	shapeManager(r);
	shapeManager(sp);
	
}

public static void shapeManager(Shape s){
	
	String str=s.getDim();
	System.out.println(s.getName());
	s.calculateArea();
	if(str=="2D"){
		s.calculatePerimeter();
	System.out.println(s.getPerimeter());
	}
	else
		{s.calculateVolume();
		System.out.println(s.getVolume());}
	
	System.out.println(s.getArea());

	
	System.out.println();
}
}

