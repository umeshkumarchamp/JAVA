package EmployeeManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao {
	
	/**
	 * Add a New Employee
	 * @param emp
	 * @param con
	 * @throws SQLException
	 */
	public static void addEmployee(Employee emp, Connection con) throws SQLException {
		String query = Query.insert;
		PreparedStatement pstmt = con.prepareStatement(query); 
		pstmt.setInt(1, emp.getId());
		pstmt.setString(2, emp.getFullname());
		pstmt.setInt(3, emp.getAge());
		pstmt.setString(4, emp.getMobile());
		pstmt.setInt(5, emp.getSalary());
		
		int result = pstmt.executeUpdate(); 
		if(result>=1) {
			System.out.println("\nEmployee Added Successfully");
		}
	}
	
	/**
	 * Get All Employee List
	 * @param con
	 * @throws SQLException
	 */
	public static void EmployeeList(Connection con) throws SQLException {
//		ArrayList<Employee> empList = new ArrayList<Employee>(); 
		String query = Query.read; 
		Statement stmt = con.createStatement(); 
		ResultSet rs = stmt.executeQuery(query); 
		System.out.println();
		while(rs.next()) {
			Employee emp = new Employee(rs.getInt("id"), rs.getString("fullname"), rs.getInt("age"), rs.getString("mobile"),
					rs.getInt("salary")); 
			System.out.println(emp.toString()); 
		}
		
	}

	/**
	 * Update Employee By Id
	 * @param emp
	 * @param con
	 * @throws SQLException
	 */
	public static void editEmployee(Employee emp, Connection con) throws SQLException {
		String find = Query.find; 
		PreparedStatement pstmt = con.prepareStatement(find); 
		pstmt.setInt(1, emp.getId());
		ResultSet rs = pstmt.executeQuery(); 
		if(rs.next()) {
			String query = Query.edit; 
			pstmt = con.prepareStatement(query); 
			pstmt.setString(1, emp.getFullname());
			pstmt.setInt(2, emp.getAge());
			pstmt.setString(3, emp.getMobile());
			pstmt.setInt(4, emp.getSalary());
			pstmt.setInt(5, emp.getId());
			
			int status = pstmt.executeUpdate(); 
			if(status >=1) {
				System.out.println("Employee Updated Successfully of Id : "+emp.getId()); 
			}
			
		}else {
			System.out.println("\nEmployee Not Found of ID : "+emp.getId());
		}
	}

	/**
	 * Delete Employee BY ID
	 * @param empId
	 * @param con
	 * @throws SQLException
	 */
	public static void deleteEmployee(int empId, Connection con)throws SQLException {
		String find = Query.find; 
		PreparedStatement pstmt = con.prepareStatement(find); 
		pstmt.setInt(1, empId);
		ResultSet rs = pstmt.executeQuery(); 
		if(rs.next()) {
			String query = Query.delete; 
			pstmt = con.prepareStatement(query); 
			pstmt.setInt(1, empId);
			
			int res = pstmt.executeUpdate(); 
			if(res >=1) {
				System.out.println("\nEmployee Deleted"); 
			}	

		}else {
			System.out.println("\nEmployee Not Found of ID : "+empId); 
		}
		
	}
	
	
	

}
