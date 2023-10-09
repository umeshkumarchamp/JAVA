package EmployeeManagement;

public class Query {

	static String getAllUser = "SELECT * FROM users";
	static String insert = "INSERT INTO employees (id, fullname,age,mobile,salary) VALUES (?,?,?,?,?)";
	static String read = "SELECT * FROM employees";
	static String find = "SELECT * FROM employees WHERE id = ?"; 
	static String edit = "UPDATE employees SET fullname=?, age=?, mobile=?, salary=? WHERE id = ? "; 
	static String delete = "DELETE FROM employees WHERE id = ?"; 
}
