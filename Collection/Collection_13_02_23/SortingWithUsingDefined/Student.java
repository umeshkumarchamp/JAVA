package SortingWithUsingDefined;

public class Student implements Comparable<Student> {

	private int roll_number; 
	private String name; 
	private String course; 
	private int age;
	public Student(int roll_number, String name, String course, int age) {
		super();
		this.roll_number = roll_number;
		this.name = name;
		this.course = course;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", name=" + name + ", course=" + course + ", age=" + age + "]";
	}
	
	
	
	
	
	
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	
//	@Override
//	public int compareTo(Student o) {
//		if(this.age > o.getAge())
//			return 1;
//		else if (this.age <o.getAge())
//			return -1; 
//		else
//			return 0; 
//	}
	
	@Override
	public int compareTo(Student ob) {
		
		//return this.name.compareTo(ob.getName()); 
		return this.name.compareToIgnoreCase(ob.getName()); 
	}
	
	
	
	
	
}
