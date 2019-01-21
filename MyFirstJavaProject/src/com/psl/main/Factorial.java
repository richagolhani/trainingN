package com.psl.main;

import java.util.Scanner;

public class Factorial {
	
public static void main(String[] args) 
{
	int num;
	System.out.println("enter number");
	Scanner sc = new Scanner(System.in);
	num=sc.nextInt();
	
	System.out.println("factorial of "+num+" is "+fact(num));

}
public static int fact(int num)
{
	int f=1;
	
	while (num>0)
	{
			f=f*num;
			num--;
	}
	return f;
}
}