package com.psl.main;

import java.util.Scanner;

public class ControlFloww {
	
	public static boolean leap(int num)
	{
		
	if(num%4==0)
	{
		if(num%100==0)
		{
			if(num%400==0)
				return true;
			else
				return false;
		}
		else
			return true;
	} 
	else
		return false;
	}
	
	public static boolean isEven(int num)
	{
		if(num%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
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
	
	public static int power_of_x(int num)
	{
		int y=1,n,power;
		
		System.out.println("enter the power for number ");
		Scanner sc= new Scanner(System.in);
		power=sc.nextInt();
		n=power;
		while(n>0)
		{
			y=num*y;
			n--;
			
		}
		return y;
		
	}
	
public static boolean isPrime(int num)
	{
		int i,flag=0;
	for(i=2;i<num;i++)
	{
		if(num%i==0)
			{
			flag=1;
		    break;
			}
		
	}
	if(flag==0)
		return true;
	else
		return false;
	}

public static boolean isValid(int day,int month,int year)
{
	boolean yearr;
	
	if(month<=12 && year<=9999)
	{
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			{
				if(day<=31)
					return true;
				else
					return false;
			}
		else if(month==4||month==6||month==9||month==11)
		{
			if(day<=30)
				return true;
			else
				return false;
		}
		else if(month==2)
		{
			if(yearr=leap(year))
			{
				if(day<=29)
					return true;
				else
					return false;
			}
			else
			{
				if(day<=28)
					return true;
				else
					return false;
			}
		}
	}
	else
		return false;
	return false;
	
}

	
}


