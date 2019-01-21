package com.psl.main;
import java.util.*;

public class ValidDate {
	public static void main(String[] args) {
		
	int day,month,year;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter date (dd mm yyyy)");
	day=sc.nextInt();
	month=sc.nextInt();
	year=sc.nextInt();
	
	if(month<=12 && year<=9999)
	{
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			{
				if(day<=31)
					System.out.println("valid");
				else
					System.out.println("invalid");
			}
		else if(month==4||month==6||month==9||month==11)
		{
			if(day<=30)
				System.out.println("valid");
			else
				System.out.println("invalid");
		}
		else if(month==2)
		{
		
			if(year%4==0)
			{
				if(year%100==0)
				{
					if(year%400==0)
						leap(day);
					else
						notLeap(day);
				}
				else
					leap(day);
			} 
			else
				notLeap(day);
		}
	}
	else
	{
		System.out.println("invalid");
	
	}
}

	public static void notLeap(int day)
		{
			if(day<=28)
				System.out.println("valid");
			else
				System.out.println("invalid");
		}
		
		public static void leap(int day)
		{
			if(day<=29)
				System.out.println("valid");
			else
				System.out.println("invalid");
		}
		
}
