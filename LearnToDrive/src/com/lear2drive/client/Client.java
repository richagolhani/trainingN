package com.lear2drive.client;

import com.learn2drive.model.*;
import com.learn2drive.util.FuelType;
public class Client {

	public static void main(String[] args) {
	
		Car xuv=new Car();
		Car baleno=new Car();
		
	
		
		xuv.setMake("Mahindar");
		xuv.setModel("xuv 700");
		xuv.setColor("Red");
		
		System.out.println(xuv.toString());
		
		System.out.println(xuv.getColor());
		System.out.println(xuv.getModel());
		System.out.println(xuv.getMake());
		
		baleno.setColor("Black");
		baleno.setMake("Maruti");
		baleno.setModel("Baleno RS");
		
		System.out.println(baleno.getColor());
		System.out.println(baleno.getModel());
		System.out.println(baleno.getMake());
		
		SUV rexton=new SUV();
		//SUV rexton=new SUV("Ssanyong","Rexton","red",true);
		
		/*rexton.setColor("Blue");
		rexton.setFourWheelDrive(true);
		rexton.setMake("Ssanyong");
		rexton.setModel("Rexton");
		*/
		System.out.println(rexton.toString());
		System.out.println(" ");
		
		System.out.println(rexton.getColor());
		System.out.println(rexton.getModel());
		System.out.println(rexton.getMake());
		System.out.println(rexton.isFourWheelDrive());
		
		Sedan ciaz=new Sedan();
		
		ciaz.setColor("Red");
		ciaz.setMake("Maruti");
		ciaz.setModel("Ciaz");
		ciaz.setConvertible(false);
		
		carManager(xuv);
		carManager(rexton);//SUV- super class reference pointing to a sub class obj
		carManager(baleno);//car
		
		FuelType f;
		f= FuelType.CNG;//all the enums inherits from Enum class
		
		FuelType.DIESEL.getCombustionTemperature();
		
		FuelType.valueOf("PETROL");
		
		for(FuelType ft:FuelType.values()){
			System.out.println(ft.getCombustionTemperature());
		}
		
		switch(f){
		case DIESEL:
		case CNG:
		}

	}
	
	public static void carManager(Car car){//this cannot be created for child class like SUV
		System.out.println(car.getColor());
		System.out.println(car.getMake());
		System.out.println(car.getModel());
	}
}
