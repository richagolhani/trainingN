package com.psl.main;

public class NewPyramid {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i+=1)
		{
			for(j=1;j<=9;j+=1)
				{
				if(j>=6-i && j<=4+i)
					System.out.print(i*2-1);
				else
					System.out.print(" ");
				}
			System.out.println();
		}
	}

}
