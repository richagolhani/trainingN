package com.psl.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//reading data from property file
		Properties p=new Properties();
		try{
			
			p.load(new FileReader(new File("configuration.properties")));
			
			System.out.println(p.getProperty("OS"));
			System.out.println(p.getProperty("RAM"));
			System.out.println(p.getProperty("Storage"));
			
			Scanner scan=new Scanner(new File("configuration.property"));
			FileRead fr=new FileRead();
			
			File f=new File("C:\\Windows\\s");
			
			String[][] values=new String[15][16];
			int i,j=0,storage,k=0;
			
				while(scan.hasNext()){
				String line=scan.nextLine();
				Scanner token=new Scanner(line);
				i=0;
				while(token.hasNext()){
					token.useDelimiter(",");
					String value=token.next();
					values[j][i]=value;
					i++;
					k++;
				}
				storage=Integer.parseInt(values[j][2]);
				
					fr.setOS(values[j][0]);
					fr.setProcessor(values[j][1]);
					fr.setStorage(storage);
					fr.setRAM(values[j][3]);
					fr.setName(values[j][4]);
					
					
					
					System.out.print(" OS="+fr.getOS());
					System.out.print(" ,Processor="+fr.getProcessor());
					System.out.print(" ,Storage="+fr.getStorage());
					System.out.print(" ,RAM="+fr.getRAM());
					System.out.print(" ,Name="+fr.getName());
					System.out.println();
					j++;
				/*FileReader fr=new FileReader(new File(""));
				BufferedReader br=new BufferedReader(fr);
				
				br.readLine();*/
			}
				System.out.println("words ="+k);
		}catch(IOException e){
			e.printStackTrace();
		}
		}
}

