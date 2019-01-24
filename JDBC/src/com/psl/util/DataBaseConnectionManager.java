package com.psl.util;

import java.sql.Connection;
import java.sql.SQLException;

public interface DataBaseConnectionManager {

	public Connection getConnection() throws SQLException;
	public Connection closeConnection() throws SQLException;

}