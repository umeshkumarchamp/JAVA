package EmployeeManagement;

public class Employee {
	

	private int id; 
	private String fullname; 
	private int age; 
	private String mobile;
	private int salary; 
	
	public Employee(int id, String fullname, int age, String mobile, int salary) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.age = age;
		this.mobile = mobile;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFullname() {
		return fullname;
	}

	public int getAge() {
		return age;
	}

	public String getMobile() {
		return mobile;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullname=" + fullname + ", age=" + age + ", mobile=" + mobile + ", salary="
				+ salary + "]";
	}

}
