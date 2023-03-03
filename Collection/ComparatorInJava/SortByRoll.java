package ComparatorInJava;

import java.util.Comparator;

public class SortByRoll implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmp_id()> o2.getEmp_id()) {
			return 1; 
		}
		else if(o1.getEmp_id() < o2.getEmp_id()) {
			return -1; 
		}
		else {
			return 0; 
		}
	}

	
	
}
