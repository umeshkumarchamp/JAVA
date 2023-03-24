package Lab_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {

	private static String url = "jdbc:mysql://localhost:8080/lab"; 
	private static String username = "root"; 
	private static String password = "root"; 
	
	public static Connection getConn() throws SQLException {
		
		Connection con = DriverManager.getConnection(url,username,password); 
		
		return con; 
	}
	
	
}
