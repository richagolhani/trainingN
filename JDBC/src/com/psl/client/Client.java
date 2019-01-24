package com.psl.client;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;
import javax.sql.PooledConnection;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.psl.util.BankAccount;
import com.psl.util.DataBaseConnectionManager;
import com.psl.util.DataBaseConnectionManagerImpl;

public class Client {
	
	public static void main(String[] args) {
		Connection connection=null;
		Statement st;
		ResultSet rs = null;
		DataBaseConnectionManagerImpl d=new DataBaseConnectionManagerImpl();
		
		try{
			connection=d.getConnection();
			
			BankAccount iron_man=new BankAccount("Tony Stark","981640",6472.44,Date.valueOf("2001-01-01"));
			BankAccount bat_man=new BankAccount("Bruce Wayne","45670",9972.42,Date.valueOf("2000-01-02"));
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","root");//create connection
		
			connection.setAutoCommit(false);//boundary start and ends at commit()method
			st=connection.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_UPDATABLE);//to write sql statements 
			//for update-able result set
			
			//st=connection.createStatement(); for non-updatable resulSet
			
			String sql;
			sql=String.format("insert into tbl_bank_accounts  values('%s','%s','%f','%s')", iron_man.getNum(),
									iron_man.getFullName(),iron_man.getBalance(),iron_man.getOpenedOn());
			
			//st.executeUpdate(sql);//to insert update or delete use execute update
			//st.execute();to create the tables
			
			
			sql=String.format("insert into tbl_bank_accounts  values('%s','%s','%f','%s')", bat_man.getNum(),
					bat_man.getFullName(),bat_man.getBalance(),bat_man.getOpenedOn());
			
			//st.executeUpdate(sql);
			
			rs=st.executeQuery("select * from tbl_bank_accounts");
			/*while(rs.next()){//rs.previous is used for backward iterations
				System.out.println(rs.getString("account_number"));
				System.out.println(rs.getString("Full_name"));
				System.out.println(rs.getDouble("balance"));
				System.out.println(rs.getDate("opening_date"));
				System.out.println("=======================================");
			}
			*/
			rs.absolute(2);//places the cursor in second record 

			rs.relative(-1);//-1 move the cursor to previous record suppose the cursor is in 2 row new 
			                                                                       //location is 2-1=1
			rs.updateDate("opening_date", Date.valueOf("2000-04-04"));
			rs.updateRow();
			
			st.close();//close statement
			
			PreparedStatement preparest;
			preparest=connection.prepareStatement("insert into tbl_bank_accounts values(?,?,?,?)");
	
			preparest.setString(1, "0006");
			preparest.setString(2, "RichaGolhani");
			preparest.setDouble(3, 8238.403);
			preparest.setDate(4, Date.valueOf("2008-01-08"));
			
			preparest.executeUpdate();
		
			connection.commit();//this is called marking the boundary of queries"boundary demarkation"

			/*MysqlConnectionPoolDataSource ds=new MysqlConnectionPoolDataSource();
			ds.setUrl(url);
			ds.setUser(userID);
			ds.setPassword(pass);
			
			PooledConnection pc=ds.getPooledConnection();
			*/
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(connection!=null){
				try{
					connection=d.closeConnection();
					//connection.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
