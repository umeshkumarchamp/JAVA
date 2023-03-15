package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {

	static private String url = "jdbc:mysql://localhost:8080/mydb"; 
	static private String username = "root"; 
	static private String password = "root"; 
	
	public static Connection getConn() throws SQLException {
		
		Connection conn = DriverManager.getConnection(url,username,password); 
		return conn; 
	}
	
}
