package com.doe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.ConnectToDB;

public class Service {

//	method for creating table..
	public static void createTable() {
		
		final String createTableQuery = "CREATE TABLE if not exists UsersData (userid int primary key auto_increment, username varchar(20) not null, email varchar(40), mobile varchar(10) not null)"; 
		Statement stm = null; 
		
		try(Connection c = ConnectToDB.getConn()) {
			stm = c.createStatement();
			
			boolean status = stm.execute(createTableQuery);
			if(!status) {
				System.out.println("Table created successfully.");
			}else {
				System.out.println("Table not created.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(stm!=null) {
				try {
					stm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}
	}
//	method for adding new records 
	public static void addNewUser(int uid, String uname, String email, String umobile) {
		
		final String addNewUserQuery = "INSERT INTO UsersData values"
				+"(?,?,?,?)"; 
		PreparedStatement pstmt = null; 
		try(Connection c = ConnectToDB.getConn()){
			
			pstmt = c.prepareStatement(addNewUserQuery);
			pstmt.setInt(1, uid);
			pstmt.setString(2, uname);
			pstmt.setString(3, email);
			pstmt.setString(4, umobile);
			
			int result = pstmt.executeUpdate();
			
			if(result>=1) {
				System.out.println(result+" Records Added Successfully.");
			}else {
				System.out.println("Something went wrong.");
			}
			
		} catch (SQLException e) {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}
	}
	
//	method for deleting a particular row
	public static void deleteUser(int uid) {
		
		PreparedStatement pstmt = null; 
		final String deleteQuery = "DELETE from UsersData where userid = ?"; 
		try(Connection c = ConnectToDB.getConn()){

			pstmt = c.prepareStatement(deleteQuery); 
			pstmt.setInt(1, uid);
			int result = pstmt.executeUpdate();
			if(result>=1) {
				System.out.println("User with "+uid+ " id record is deleted.");
			}else {
				System.out.println(uid+" userid not found.");
			}
			
		} catch (SQLException e) {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}
	}

//	method for update user record
	public static void updateRecord(int uid, String uname, String uemail, String umobile) {
		
		final String updateQuery = "UPDATE UsersData set username = ?, email = ? , mobile = ? where userid = ?"; 	
		
		try(Connection c = ConnectToDB.getConn() ; PreparedStatement pstmt = c.prepareStatement(updateQuery)){

			pstmt.setString(1, uname);
			pstmt.setString(2, uemail);
			pstmt.setString(3, umobile);
			pstmt.setInt(4, uid);
			
			int result = pstmt.executeUpdate();
			
			if(result >= 1) {
				System.out.println("Record Updated of UserId : "+uid);
			}else {
				System.out.println("Record Not Found.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

//	method for searching record in database
	public static void searchRecord(int uid) {
		
		final String searchQuery = "SELECT * FROM UsersData where userid = ?"; 
		try(Connection c = ConnectToDB.getConn();
				PreparedStatement pstmt = c.prepareStatement(searchQuery);
				){
			pstmt.setInt(1, uid);
			
			System.out.println("User-Id"+"\t"+"Username"+"\t"+"Email-Id"+"\t"+"Phone");

			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
//	method of reterive records 
	public static void showAllRecord() {
			
			final String showAllRecordQuery = "SELECT * FROM UsersData"; 
			try(Connection c = ConnectToDB.getConn();
					Statement stmt = c.createStatement();
					){
				//stmt.setInt(1, uid);
				
				System.out.println("User-Id"+"\t"+"Username"+"\t"+"Email-Id"+"\t"+"Phone");
	
				ResultSet rs = stmt.executeQuery(showAllRecordQuery);
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


//	method for searching record by username...
	public static void searchRecordByUsername(String uname) {
		
		final String searchQuery = "SELECT * FROM UsersData where username = ?"; 
		try(Connection c = ConnectToDB.getConn();
				PreparedStatement pstmt = c.prepareStatement(searchQuery);
				){
			pstmt.setString(1, uname);
			

			ResultSet rs = pstmt.executeQuery();
			
//			boolean res = pstmt.execute();
//			System.out.println(res);
						
			if(rs.next()) {
				System.out.println("User-Id"+"\t\t"+"Username"+"\t\t"+"Email-Id"+"\t\t"+"Phone");
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));

//				while(rs.next()) {
//					System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
//				}
				
			}else {
				System.out.println("Sorry Wrong username");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
