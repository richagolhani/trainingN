package jdbcAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BookingSystem {

	Connection conn=null;
	Statement st = null;
	ResultSet rs;
	
	public void show(String Moviename){
		String sql;
		
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","root");
			st=conn.createStatement();
			
			sql=String.format("select * from booking where Name = '%s'",Moviename);
			rs=st.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString("Name")+" "+rs.getString("ShowTime"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteShow(){
		
	}
	public void updateShow(){
		
	}
	public void addNewMovie(){
		try{
			File f=new File("movies.txt");
		
		FileWriter fw=new FileWriter(f);
		fw.append("5,Talashhh,Hindi,1/2/2001");
		fw.close();
		
		Scanner scan=new Scanner(new File("movies.txt"));
		ReadFile fr=new ReadFile();
		
		String sql;
		String line=scan.nextLine();
		Scanner token=new Scanner(line);
		String[] values=new String[15];
		int i=0;
		while(token.hasNext()){
			token.useDelimiter(",");
			String value=token.next();
			values[i]=value;
			i++;
		}
			fr.setId(values[0]);
			fr.setName(values[1]);
			fr.setLang(values[2]);
			fr.setDate(values[3]);
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","root");
			st=conn.createStatement();

			sql=String.format("insert into movies_details values('%s','%s','%s','%s')", fr.getId(),
					fr.getName(),fr.getLang(),fr.getDate());
			st.executeUpdate(sql);
	
		}catch(IOException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	/*public void newShow(){
		
		FileRead fileread=new FileRead();
		String sql;
		
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","root");
			st=conn.createStatement();

			sql=String.format("insert into booking values('%s','%s')", fileread.getMname());
			rs=st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
