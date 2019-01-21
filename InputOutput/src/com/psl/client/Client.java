package com.psl.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Client {

	public static void main(String[] args) {
		try(FileInputStream fi=new FileInputStream(new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg"));
		FileOutputStream fo=new FileOutputStream(new File("New-Koala.jpg")))//read file present on the disk
		{
			int byteRead;
			while((byteRead =fi.read())!=-1){
				fo.write(byteRead);
			}
			/* int bytesRead;
			 * byte data[]=new byte[1024];
			
			while((bytesRead =fi.read(data))!=-1){
				fo.write(data, 0 , bytesRead);
			}*/
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
