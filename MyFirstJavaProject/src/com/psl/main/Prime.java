package com.psl.main;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int i,num,flag=0;
		
		System.out.println("enter number");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		
		for(i=2;i<num;i++)
		{
			if(num%i==0)
				{
				flag=1;
			    break;
				}
			
		}
		if(flag==0)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

}
