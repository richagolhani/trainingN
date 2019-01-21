package com.psl.main;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try{
			searchProduct("code-001");
			 	try(FileReader fr = new FileReader("some file")){
			 		
			 		}
			 	catch(IOException ex)
			 		{
			
			 		}
			}
		catch(ProductNotFoundException e)
		{
			
		}
			finally
			{
				
			
			}
	}
	public static void searchProduct(String productcode) throws ProductNotFoundException,NullPointerException{
		throw new ProductNotFoundException("not found");
	}
}
