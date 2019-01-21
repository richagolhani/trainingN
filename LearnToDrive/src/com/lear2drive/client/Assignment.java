package com.lear2drive.client;
import com.learn2drive.model.*;
import com.learn2drive.util.FuelType;

public class Assignment {
public static void main(String[] args) {
	String[] arr={"MH-31-3656,124578.00,Dominar,CNG",
			 "MH-49-6768,36568.00,Activa,PETROL",
			 "MH-20-5676,376895,BMW-GS,DIESEL"};
	
		Vehicle VehicleArr[]=readCSV(arr);
		for(Vehicle v:VehicleArr)
		{System.out.print("R.no.: "+v.getRegistrationNumber()+" ");
		System.out.print("price: "+v.getPrice()+" ");
		System.out.print("Name: "+v.getName()+" ");
		System.out.print("fueltype:w "+v.getFueltype()+" ");
		System.out.println();}
	}

public static Vehicle[] readCSV(String[] arr){
	Vehicle[] object=new Vehicle[3];
	
	for(int i=0;i<arr.length;i++)
	{
		String[] words=arr[i].split(",");
		FuelType ft=FuelType.valueOf(words[3]);
		double rate=Double.parseDouble(words[1]);

		object[i] = new Vehicle();
		object[i].setRegistrationNumber(words[0]);
		object[i].setPrice(rate);
		object[i].setName(words[2]);
		object[i].setFueltype(ft);
	}
	
	
	return object;
}
}
