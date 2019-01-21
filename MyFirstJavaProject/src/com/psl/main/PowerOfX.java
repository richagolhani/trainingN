package com.psl.main;

import java.util.Scanner;

public class PowerOfX {
	public static void main(String[] args) {
		int num,y=1,n,power;
		System.out.println("enter number and power");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		power=sc.nextInt();
		n=power;
		while(n>0)
		{
			y=num*y;
			n--;
			
		}
		System.out.print(num+" power "+power+" = "+y);
	}

}
