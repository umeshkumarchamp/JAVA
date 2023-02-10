package Projects;

public class Student {

	private int student_roll; 
	private String student_name; 
	private String contact_number; 
	private String course;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int student_roll, String student_name, String contact_number, String course) {
		super();
		this.student_roll = student_roll;
		this.student_name = student_name;
		this.contact_number = contact_number;
		this.course = course;
	}

	public int getStudent_roll() {
		return student_roll;
	}

	public void setStudent_roll(int student_roll) {
		this.student_roll = student_roll;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

//	@Override
//	public String toString() {
//		return "Student [student_roll=" + student_roll + ", student_name=" + student_name + ", contact_number="
//				+ contact_number + ", course=" + course + "]";
//	} 
//	
	public String toString() {
		return "Student Roll : "+student_roll+"\nStudent Name : "+student_name+"\nContact : "+contact_number+"\nCourse : "+course; 
	}

	
}
