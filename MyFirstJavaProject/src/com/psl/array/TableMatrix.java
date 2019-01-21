package com.psl.array;

public class TableMatrix {

	public static int[][] rectangularArray()
	{
		int a[][]= new int[12][13];
		int i,j;
		
		for(i=0;i<a.length;i++)
		{
			a[i][0]=i+1;
			for(j=1;j<a[i].length;j++)
			{
				a[i][j]=(i+1)*(j+1);
			}
		}
		return a;
	}
}
