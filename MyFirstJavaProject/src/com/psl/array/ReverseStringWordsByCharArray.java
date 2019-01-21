package com.psl.array;

public class ReverseStringWordsByCharArray {

	public static void main(String[] args) {
		String str="To be or not to be";
		char[] charArr=str.toCharArray();
		System.out.println(charArr);
		char cArr[]=reverseString(charArr);
		for(char c:cArr)
			System.out.print(c);
	}
	
	public static char[] reverseString(char charArr[])
	{
		int i,j;
		int x=0,k=0;
		char Arr[]=new char[25];
		for(i=x;i<charArr.length;i++)
		{
			if(charArr[i]==' '||i==charArr.length-1)
			{
				if(i==charArr.length-1)
					j=i;
				else
					j=i-1;
				for(;j>=x;j--)
				{
					Arr[k]=charArr[j];
					k++;
				}
				if(i<charArr.length-1){
					Arr[k]=charArr[i];
					k++;
					}
				x=i+1;
				
			}
			
		}
		return Arr;
	}
	

}
