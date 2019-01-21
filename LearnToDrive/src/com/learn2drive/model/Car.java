package com.learn2drive.model;

//entity/ model/ java bean
public class Car {	
	
	//extends Object
			//data members/attributes/instance variables
	
	private String make,model,color;
	private Engine engine;/*has a relationship called containership => composition/aggregation
	 													*i.e.every car has a engine*/ 

	/* member methods
	 * instance methods
	 * getter=accessor*/
	public Car()//no-arg constructor
	{
		make=model=color="";
	}
	public Car(String make,String model,String color)
	{
		this.make=make;
		this.model=model;
		this.color=color;
	}
	
	public String getMake() {
		return make;
	}

	//setter=mutator
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override//annotation 
	public String toString(){//override toString() is already a method in Object Class 
		return getMake()+"- "+getModel()+"- "+getColor();
	}
}
