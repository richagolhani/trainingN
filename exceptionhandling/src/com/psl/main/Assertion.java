package com.psl.main;

public class Assertion {

	public static void main(String[] args) {
		System.out.println(calSpeed(50,0));
	}
	public static double calSpeed(double d,double t){
		assert d>0 :"Distance should be greater than zero";
		assert t>0:"Time should be greater than zero";
		return d / t;
		
	}
}
