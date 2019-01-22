package nuggetAssignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileInput {

	public static void main(String[] args) {
		
		String data="This is self study assignment ";
		
		try{
		File f=new File("file.io.txt");
		
		FileWriter fw=new FileWriter(f);
		fw.write(data);
		fw.close();
		System.out.println("done");
		
		BufferedReader br=new BufferedReader(new FileReader(f));
		String st;
		while((st=br.readLine())!=null){
			System.out.println(st);
		}
		
		System.out.println("size of file in bytes="+f.length());
		br.close();
		if(f.delete()){
			System.out.println("file deleted");
		}
		
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
