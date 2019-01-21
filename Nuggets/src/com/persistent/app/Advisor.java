package com.persistent.app;

public class Advisor {
 
	String[] message = new String[5];
	
	public static String advices(int i){
		Advisor ad=new Advisor();
		ad.message[0]="good morning";
		ad.message[1]="Hello";
		ad.message[2]="Bye";
		if(i==0){
			return "Advice- "+ad.message[0];
		}
		if(i==1){
			return "Advice- "+ad.message[1];
		}
		if(i==2){
			return "Advice "+ad.message[2];
		}
		return "no advices available";
	}
}
