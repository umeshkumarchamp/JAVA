package Projects;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

//		Student s1 = new Student(); 
//		
//		s1.setStudent_roll(11);
//		s1.setStudent_name("Umesh");
//		s1.setContact_number("6201033951");
//		s1.setCourse("MCA");
//		
//		
//		List<Student> studentList = new ArrayList<>(); 
//		
//		System.out.println(studentList.add(s1));
//		
//		System.out.println(s1.toString());
//		
//		System.out.println();
//		
//		Student s2 = new Student(12, "Manish", "7050344414", "MBA"); 
//		System.out.println(s2.toString());
//		System.out.println();
//		for(Student st: studentList) {
//			System.out.println(st);
//		}
//		
//		
		Employee e1 = new Employee(); 
		
		e1.setEmp_id(101);
		e1.setEmp_name("Umesh Kumar");
		e1.setEmp_number("6201033951");
		e1.setEmp_address("Ranchi Jharkhand");
		
		Employee e2 = new Employee(); 
		
		e2.setEmp_id(102);
		e2.setEmp_name("Manish Kumar");
		e2.setEmp_number("6201033951");
		e2.setEmp_address("Hazaribag ");
		
		Employee e3 = new Employee(103,"Sweta","7677479238","Hazaribag"); 
		
		List<Employee> empList = new ArrayList<>(); 
		empList.add(e1); 
		empList.add(e2); 
		empList.add(e3); 
		//System.out.println("Data Added : "+ empList.add(e1));
		System.out.println();
		System.out.println(e1.toString());
	
		for(int i=0; i<empList.size(); i++)
		{
			System.out.println(empList.get(i).getEmp_id());
		}
		

	}

}
