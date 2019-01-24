package com.psl.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionManagerImpl implements DataBaseConnectionManager{

	
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");//loading driver
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	private Connection con;
	@Override
	public Connection getConnection() throws SQLException {
	
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms");
		return con;
	}

	@Override
	public Connection closeConnection() throws SQLException {
		try{con.close();}catch(SQLException e){e.printStackTrace();}
		return null;
	}

}
