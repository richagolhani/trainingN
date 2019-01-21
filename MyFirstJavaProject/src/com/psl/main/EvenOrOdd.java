package com.psl.main;
import java.util.*;

public class EvenOrOdd {
	public static void main(String[] args) {
		int num;
		
		System.out.println("enter number");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.print("odd");
		}
	}

}
