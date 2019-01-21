package com.psl.array;


public class ArrayMain {
public static void main(String[] args) 
{
	int arr[]={10,40,20,60,30};
	int result=ArrayClass.linearSearch(arr);
	if(result==0)
		System.out.println("element is not present");
	else
	    System.out.println("position of element is "+result);
	
	int arry[]=ArrayClass.sort(arr);
	
	for(int var:arry)
		System.out.println(var);
	
	
}
}
