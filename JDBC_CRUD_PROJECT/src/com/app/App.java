package com.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.connection.ConnectToDB;
import com.doe.Service;

public class App {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		int ch; 
		String username = "umesh123"; 
		String password = "12345"; 
		boolean flag = false; 
		try(Connection c = ConnectToDB.getConn())
		{
			
			Statement stmt = c.createStatement(); 
			ResultSet rs =  stmt.executeQuery("SELECT * FROM acc");
			
			while(rs.next()) {
				if((rs.getString(1).equals(username)) && (rs.getString(2).equals(password)))
				{
					flag = true; 
				}
			}
			
			
		
			if(flag) {
				do {
					System.out.println("1. Adding new Record\n2.Deleting a Record.\n3.Updating a Record.\n4.Searching a Record.\n5.Pring all Record.\n9.For Exit\nEnter Your Choice : ");
					ch = sc.nextInt();
					switch(ch) 
					{
					case 1:
						int uid; 
						String uname,uemail,umobile;
						System.out.println("Enter User Id : ");
						uid = sc.nextInt(); 
						sc.nextLine();
						System.out.println("Enter Username : ");
						uname = sc.nextLine(); 
						System.out.println("Enter User Email-Id : ");
						uemail = sc.nextLine(); 
						System.out.println("Enter User Mobile Number : ");
						umobile = sc.nextLine(); 
						Service.addNewUser(uid,uname,uemail,umobile);
		
						System.out.println("Press any key to continue....");
		
						try {
							System.in.read();
						} catch (IOException e) {
							e.printStackTrace();
						}
						break; 
					case 2:
						System.out.println("Enter User Id : ");
						uid = sc.nextInt(); 
						Service.deleteUser(uid);
						break;
					case 3:
						System.out.println("Enter User Id : ");
						uid = sc.nextInt(); 
						System.out.println("Enter Username : ");
						uname = sc.nextLine(); 
						sc.nextLine();
						System.out.println("Enter User Email-Id : ");
						uemail = sc.nextLine(); 
						System.out.println("Enter User Mobile Number : ");
						umobile = sc.nextLine(); 
						Service.updateRecord(uid, uname, uemail, umobile);
		
						break;
					case 4:
						System.out.println("Enter User Id");
						uid = sc.nextInt(); 
						Service.searchRecord(uid);
						break;
					case 5:
						Service.showAllRecord();
						break;
					case 9:
						System.exit(0);
						break; 
					default:
						System.out.println("Invalid Choice !\nEnter Again : ");
						ch = sc.nextInt();
						break;
					}
					
				}while(ch!=9); 
			}else {
				System.out.println("Username & Password not found.");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
//		try {
//			System.out.println(ConnectToDB.getConn());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		
//		Service.createTable();

//		Service.addNewUser(101, "Sweta Kumar", "sweta@gmail.com", "629103890");
		
//		Service.deleteUser(102);
		
//		Service.updateRecord(100, "Champ Kumar","champ@gmail.com", "7050344414");
		
//		Service.searchRecord(100);
		
//		Service.showAllRecord();
		
//		Service.searchRecordByUsername("Champ Kumar");
	}

}
