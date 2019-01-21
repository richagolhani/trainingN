package com.psl.array;

public class ReverseStringClass {
	public static void main(String[] args) {
		String str="To be or not to be ";
		char[] charArr=str.toCharArray();
		char cArr[]=reverseString(charArr);
		for(char c:cArr)
		System.out.print(c);
	}
	
	public static char[] reverseString(char charArr[])
	{
		int i,j;
		int x=0,k=0;
		char Arr[]=new char[30];
		for(i=x;i<charArr.length;i++)
		{
			if(charArr[i]==' '||charArr[i]=='\0')
			{
				
				for(j=i-1;j>=x;j--)
				{
					Arr[k]=charArr[j];
					k++;
					
				}
				x=i+1;
			}
		}
		return Arr;
	}
	

}
