package com.psl.util;
import java.lang.*;

public class Fibonacci {

	public static void main(String[] args) {
		int n=8;
		double c,x,y = 1,z = 1;
		
		for(int i=0;i<n;i++){
			
			z=z*(1+Math.sqrt(5))/2;
			y=y*(1-Math.sqrt(5))/2;
		
		c=(z-y)/Math.sqrt(5);
		System.out.println(c+" ");
		
		}
	}
}
