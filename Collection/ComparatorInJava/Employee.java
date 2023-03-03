package ComparatorInJava;

public class Employee {
	
	private int emp_id; 
	private String emp_name; 
	private String emp_deg; 
	private float salary;
	public Employee(int emp_id, String emp_name, String emp_deg, float salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_deg = emp_deg;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_deg=" + emp_deg + ", salary=" + salary
				+ "]";
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

	public String getEmp_deg() {
		return emp_deg;
	}

	public void setEmp_deg(String emp_deg) {
		this.emp_deg = emp_deg;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	} 
	
	

}
