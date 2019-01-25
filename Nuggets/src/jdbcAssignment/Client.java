package jdbcAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import collectionAssignment.Product;


public class Client {
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");//loading driver
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	
	String data="6,JabTakHainJnn,English,23/4/12\n";
			/*+ "7,Av,English,4/5/12\n"
			+ "8,ThId,Hindi,6/4/12\n"
			+"9,SOTYe,Hindi,3/10/12\n";*/
		
	try{
			
	File f=new File("movies.txt");
		
	FileWriter fw=new FileWriter(f);
	fw.write(data);
	fw.close();
		
	Connection conn=null;
	Statement st = null;
	ResultSet rs;
		
	String[][] values=new String[15][16];
	int i,j=0;
	Scanner scan=new Scanner(new File("movies.txt"));
	ReadFile fr=new ReadFile();
		
	while(scan.hasNext()){
		String line=scan.nextLine();
		Scanner token=new Scanner(line);
		i=0;
		while(token.hasNext()){
			token.useDelimiter(",");
			String value=token.next();
			values[j][i]=value;
			i++;
		}
			
		fr.setId(values[j][0]);
		fr.setName(values[j][1]);
		fr.setLang(values[j][2]);
		fr.setDate(values[j][3]);
				
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","root");
		st=conn.createStatement();
				
		String sql;
		sql=String.format("insert into movies_details values('%s','%s','%s','%s')", fr.getId(),
										fr.getName(),fr.getLang(),fr.getDate());
		st.executeUpdate(sql);
		j++;
	}		
		BookingSystem bs=new BookingSystem();
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter movie name of your choice ");
		String MovieName=sc.nextLine();
		
		rs=st.executeQuery("select Name from booking");
		while(rs.next()){
		if(MovieName.compareTo(rs.getString("Name"))==0){
		bs.show(MovieName);
		}}
	
			bs.addNewMovie();
			conn.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
	}
}
