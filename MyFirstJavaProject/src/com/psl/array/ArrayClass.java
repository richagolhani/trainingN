package com.psl.array;

public class ArrayClass {

	public static int linearSearch(int arr[])
	{
		int x=20,i=1;
		for(int var:arr)
		{
			if(var==x)
				return i;
			i++;	
		}
		return 0;
	}
	
	public static int[] sort(int arr[])
	{
		int i,j,temp;
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}
