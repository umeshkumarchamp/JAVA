package Lab_Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Company {

//	Method for creating table
	public static void createTable() {
		String query = "CREATE TABLE user (username varchar(30) primary key, "
				+ "password varchar(20) not null)";
		
		PreparedStatement pstmt = null; 
		try(Connection con = ConnectToDB.getConn()){

			pstmt = con.prepareStatement(query); 
			
			boolean status = pstmt.execute(); 
			
			if(!status) {
				System.out.println("Table Created.");
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
//	Method for add user 
	public static void addRecord(String user, String pass) {
		
		String query = "INSERT INTO user values(?,?)"; 
		PreparedStatement pstmt = null; 
		
		try(Connection con = ConnectToDB.getConn()){

			pstmt = con.prepareStatement(query); 
			if(pass.length()>6) 
			{
				if(!pass.contains(" ")) 
				{
				
					pstmt.setString(1, user);
					pstmt.setString(2, pass);
					boolean status = pstmt.execute(); 
					if(!status) {
						System.out.println("Record Successfully Added.");
					}else {
						System.out.println("Something went wrong....");
					}
					
				}else
				{
					System.out.println("password should not contain space!!!");
				}
				
			}else {
				System.out.println("Password minimum length should be 6 characters!!!");
			}

			
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("username already exists. Please create a new username!!!");
		}
		
	}
	
	
//	Method of updating records....
	public static void updateRecord(String user, String pass) {
		PreparedStatement pstmt = null; 
		String query = "UPDATE user set password = ? where username = ?"; 
		
		try(Connection con = ConnectToDB.getConn())
		{

			pstmt = con.prepareStatement(query); 
			if(pass.length()>6) 
			{
				if(!pass.contains(" "))
				{
					
					pstmt.setString(1, pass);
					pstmt.setString(2, user);
					
					int status = pstmt.executeUpdate(); 
					if(status >= 1) {
						System.out.println("Record updated Successfully.");
					}else {
						System.out.println("username doesn't exists!!!");
					}
					
				}else {
					System.out.println("password should not contain space!!!");
				}
				
			}else 
			{
				System.out.println("Password minimum length should be 6 characters!!!");

			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
//	Method for search a particular user 
	public static void searchRecord(String username) {
		
		final String query = "SELECT * FROM user where username = ?"; 
		try(Connection con = ConnectToDB.getConn(); PreparedStatement pstmt = con.prepareStatement(query)){

			pstmt.setString(1, username); 
			ResultSet rs = pstmt.executeQuery(); 
			if(rs.next()) {
				System.out.println("Username : "+rs.getString(1)+"\nPassword : "+rs.getString(2));
			}else {
				System.out.println("username doesn't exists. Please try again...");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
