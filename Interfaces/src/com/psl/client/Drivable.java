package com.psl.client;

public interface Drivable {

	int variable =100;//it is equivalent to public static final int v in an interface
	//void accelerate();//method in an interface is by default abstract and public

	public default void accelerate(){
		
	} 
	public void steer();
	
}
