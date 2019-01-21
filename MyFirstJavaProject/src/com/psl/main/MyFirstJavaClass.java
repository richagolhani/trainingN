package com.psl.main;
import java.util.Scanner;

public class MyFirstJavaClass {
	
	public static void main(String[] args) {
		Sum obj=new Sum();
		System.out.println("Hello !!!!!!");
		System.out.println("enter a and b");
		Scanner s = new Scanner(System.in);
		obj.a=s.nextInt();
		obj.b=s.nextInt();
		obj.sum=obj.add(obj.a,obj.b);
		System.out.println("sum="+obj.sum);
	
	}

}
