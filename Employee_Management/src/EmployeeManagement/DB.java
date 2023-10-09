package EmployeeManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
	
	public static Connection connect() {
		Connection conn = null; 
		try {
			Class.forName("org.postgresql.Driver"); 
			String url = "jdbc:postgresql://localhost/school";
			Properties props = new Properties(); 
			props.setProperty("user", "postgres"); 
			props.setProperty("password", "root"); 
			
			conn = DriverManager.getConnection(url,props); 
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return conn; 
	}
}
