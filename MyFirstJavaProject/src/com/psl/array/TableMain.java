package com.psl.array;

public class TableMain {
	public static void main(String[] args) {
		
	
	int ar[][]=TableMatrix.rectangularArray();
	for(int ary[]:ar)
	{
		for(int ay:ary)
			System.out.print("  "+ay);
		 System.out.println();
	}
	}
}
