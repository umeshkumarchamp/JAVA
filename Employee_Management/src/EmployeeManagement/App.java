package EmployeeManagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean flag = false; 
		try(Connection con = DB.connect()){
			
			/**
			 * Admin Login
			 */
			System.out.println("<============ L O G I N ============>"); 
			System.out.print("Enter Email : "); 
			String email = sc.nextLine(); 
			System.out.print("Enter Password : ");
			String pwd = sc.nextLine(); 
			
			Statement stmt = con.createStatement(); 
			String query = Query.getAllUser ;
			ResultSet rs = stmt.executeQuery(query); 
			
			while(rs.next()) {
				if(email.equals(rs.getString("email")) && pwd.equals(rs.getString("password"))) {
//					System.out.println("============= W E L C O M E ==============");
					System.out.println("\nUSER : "+ rs.getString(5));
					flag = true; 
				}
			}
			
			if(flag){
				int choice; 
				do {
					System.out.println("\n<======= E M P L O Y E E    M A N A G E M E N T    S Y S T E M =======>\n");
					System.out.println("Select 1 : Add Employee\nSelect 2 : Employee List\nSelect 3 : Update Employee\n"
							+ "Select 4 : Delete Employee \nSelect 0 : Exit..."); 
					System.out.print("Enter Your Choice : "); 
					choice = sc.nextInt(); 
					switch(choice){
					case 1: 
						System.out.print("Enter Id : ");
						int id = sc.nextInt(); 
						sc.nextLine(); 
						System.out.print("Enter Fullname : ");
						String fullname = sc.nextLine(); 
						System.out.print("Enter Age : ");
						int age = sc.nextInt(); 
						sc.nextLine(); 
						System.out.print("Enter Mobile : ");
						String mobile = sc.nextLine(); 
						System.out.print("Enter Salary : ");
						int salary = sc.nextInt(); 
						Employee emp = new Employee(id, fullname, age, mobile, salary); 
						EmployeeDao.addEmployee(emp,con);
//						System.out.println(id+" "+fullname+ " "+age+" " + mobile+" "+salary);
						break; 
					case 2:
						EmployeeDao.EmployeeList(con); 
						break; 
					case 3:
						System.out.print("Enter EmployeeId : "); 
						int empId = sc.nextInt(); 
						sc.nextLine(); 
						System.out.print("Enter Fullname : ");
						fullname = sc.nextLine(); 
						System.out.print("Enter Age : ");
						age = sc.nextInt(); 
						sc.nextLine(); 
						System.out.print("Enter Mobile : ");
						mobile = sc.nextLine(); 
						System.out.print("Enter Salary : ");
						salary = sc.nextInt(); 
						emp = new Employee(empId, fullname, age, mobile, salary); 
						EmployeeDao.editEmployee(emp,con);
						break; 
					case 4:
						System.out.print("Enter Employee Id : ");
						empId = sc.nextInt(); 
						EmployeeDao.deleteEmployee(empId, con);
						break; 
					case 0:{
//						System.exit(0);
						break; 
					}
					default:
						System.out.println("Invalid Choice !");
					}
					
					
				}while(choice != 0);

				
				System.out.println("\n=============== Thanks for Visiting ==============="); 
			}else {
				throw new Exception("User Not Found !"); 
			}

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		 sc.close(); // Close the Scanner 
		
	}

}
