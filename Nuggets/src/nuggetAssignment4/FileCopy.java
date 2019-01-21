package nuggetAssignment4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			FileInputStream fi=new FileInputStream(new File(args[0]));
			
			File f=new File(args[0]);
			if(f.exists()){
				File tempFile= new File(args[1]);
				if(tempFile.exists()){
					System.out.println("do you want to overwrite (y/n)");
					char choice;
					choice=sc.next().charAt(0);
					if(choice=='Y'||choice=='y'){
						FileOutputStream fo=new FileOutputStream(new File(args[1]));
						System.out.println("done");
					}
				}
				else{
					FileOutputStream fo=new FileOutputStream(new File(args[1]));
					System.out.println("done");
				}
			}
			
			
			
		}catch(FileNotFoundException e){
			System.out.println("no file exists");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
