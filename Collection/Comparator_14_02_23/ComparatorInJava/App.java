package ComparatorInJava;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		            Comparator 
		           /    |     \
		      lamda  Anonmous  creating a 
		              class      new class
		 */
		// creating instance of linkedlist class for storing all employee objects
		List<Employee> listOfEmployee = new LinkedList<>(); 
		
		// adding employee objects into listOfEmployee
		listOfEmployee.add(new Employee(101, "Umesh", "IT", 5000.00f)); 
		listOfEmployee.add(new Employee(102, "Dharam", "Civil", 87000.00f));
		listOfEmployee.add(new Employee(103, "Gautam", "Finance", 66000.00f));
		listOfEmployee.add(new Employee(104, "Roshan", "Software", 45000.00f));
		listOfEmployee.add(new Employee(105, "Pankaj", "Goverment", 26000.00f));
		listOfEmployee.add(new Employee(106, "Tinki", "IT", 74000.00f));
		listOfEmployee.add(new Employee(107, "Priya", "IT", 65000.00f)); 
		listOfEmployee.add(new Employee(108, "Sweta", "Android", 35000.00f));
		listOfEmployee.add(new Employee(109, "Muskan", "Marketing", 65000.00f));
		listOfEmployee.add(new Employee(110, "Niraj", "Finance", 45000.00f));
		listOfEmployee.add(new Employee(111, "Atul", "Cyber", 28700.00f));
		listOfEmployee.add(new Employee(112, "Dinesh", "Government", 35000.00f));
		
		listOfEmployee.forEach(val -> System.out.println(val));
		
		//SortByName sortByName = new SortByName(); 
		Collections.sort(listOfEmployee, new SortByName());
		System.out.println("\nSorting By Name : \n");
		listOfEmployee.forEach(val -> System.out.println(val));
		
		SortByRoll sbr = new SortByRoll(); 
		System.out.println("\nSorting BY Roll No : \n");
		Collections.sort(listOfEmployee, sbr);
		listOfEmployee.forEach(val -> System.out.println(val));
		
		System.out.println("\nSorting in Reverse order : \n");
		Collections.reverse(listOfEmployee);
		listOfEmployee.forEach(val -> System.out.println(val));
		
		
		Collections.sort(listOfEmployee, new Comparator<Employee>() {
			public int compare(Employee ob1, Employee ob2) {
				if(ob1.getSalary() > ob2.getSalary()) {
					return 1; 
				}
				else if(ob1.getSalary() < ob2.getSalary()) {
					return -1; 
				}
				return 0; 
			}
		});
		// Anonymous function 
		System.out.println("\nSorting By Salary Using Anonymous Function : \n");
		listOfEmployee.forEach(val -> System.out.println(val));

		Collections.sort(listOfEmployee, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmp_name().compareToIgnoreCase(o2.getEmp_name()); 
			}
			
		});
		
		System.out.println("\nSorting By Employee Name Using Anonymous function : \n");
		listOfEmployee.forEach(val -> System.out.println(val));
		
		// Using Lambda 
		Collections.sort(listOfEmployee,(Employee o1, Employee o2) -> o1.getEmp_name().compareToIgnoreCase(o2.getEmp_name())); 
		System.out.println("\nSorting By Employee Name Using Lamda  : \n");
		listOfEmployee.forEach(val -> System.out.println(val));
			
		
		
		
		
	}

}
