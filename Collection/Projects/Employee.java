package Projects;

public class Employee {

	private int emp_id; 
	private String emp_name; 
	private String emp_number; 
	private String emp_address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int emp_id, String emp_name, String emp_number, String emp_address) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_number = emp_number;
		this.emp_address = emp_address;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_number() {
		return emp_number;
	}
	public void setEmp_number(String emp_number) {
		this.emp_number = emp_number;
	}
	public String getEmp_address() {
		return emp_address;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	} 
	
	public String toString() {
		return "Employee id : "+emp_id+"\nEmployee Name : "+emp_name+"\nEmployee Contact : "+emp_number+"\nEmployee Address : "+emp_address; 
	}
	
	
}
