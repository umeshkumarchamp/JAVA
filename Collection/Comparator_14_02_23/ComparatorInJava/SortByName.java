package ComparatorInJava;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee ob1, Employee ob2) {	
		return ob1.getEmp_name().compareTo(ob2.getEmp_name());
		//return ob2.getEmp_name().compareTo(ob1.getEmp_name());
	}
	
	
}
