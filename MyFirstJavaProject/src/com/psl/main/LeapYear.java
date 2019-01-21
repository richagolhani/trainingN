package com.psl.main;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
	int num,choice,answer,day,month,year;	
	boolean result;
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter choice \n1:is_leap_year\n2:isEven\n3:factorial\n4;power_of_x\n5:isPrime\n6:isValidDate\n");
	choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:System.out.println("enter any year");
			num=sc.nextInt();
	
			result=ControlFloww.leap(num);
			System.out.println(result);
			break;
	case 2:System.out.println("enter any value");
			num=sc.nextInt();
			
			result=ControlFloww.isEven(num);
			System.out.println(result);
			break;
	case 3:System.out.println("enter any value");
			num=sc.nextInt();
			answer=ControlFloww.fact(num);
			System.out.println(answer);
			break;
	case 4:System.out.println("enter any value");
			num=sc.nextInt();
			answer=ControlFloww.power_of_x(num);
			System.out.println(answer);
			break;
	case 5:System.out.println("enter any value");
			num=sc.nextInt();
			result=ControlFloww.isPrime(num);
			System.out.println(result);
			break;
	case 6:System.out.println("please enter the date in (dd mm yyyy) format");
		day=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		result=ControlFloww.isValid(day, month, year);
		System.out.println(result);
		break;
	}
	
	}
}
