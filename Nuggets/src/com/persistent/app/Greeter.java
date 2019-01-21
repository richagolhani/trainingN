package com.persistent.app;

import java.util.Random;

public class Greeter {

	static String name;

	public Greeter(String name) {
		super();
		this.name = name;
	}

	public static String sayHello(){
		return "Hello "+name;
	}
	
	public static String sayBye(){
		return "Bye "+name;
	}
	
	
	
}
