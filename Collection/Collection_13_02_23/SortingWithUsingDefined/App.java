package SortingWithUsingDefined;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1,"Umesh","MCA",23);
		Student s2 = new Student(2, "Sweta","B-tech",24);
		Student s3 = new Student(3,"Manish","BCA",25); 
		Student s4 = new Student(5,"Atul","MBA",23); 
		
		List<Student> studentList = new ArrayList<>(); 
		Collections.addAll(studentList, s1,s2,s3);
		studentList.add(new Student(4,"Muskan","MCA",22)); 
		studentList.add(s4); 
		// Traverse using iterator..
		Iterator<Student> itr = studentList.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//Collections.sort(studentList);
		Collections.sort(studentList);
		System.out.println("\nAfter Sorting the list : \n");
		//mobileList.forEach(abc-> System.out.println(abc));
		studentList.forEach(a-> System.out.println(a));
	}

}
