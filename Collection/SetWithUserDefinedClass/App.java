package SetWithUserDefinedClass;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		Set<Laptop> listOfLaptop = new HashSet<>(); 
		
		listOfLaptop.add(new Laptop(2321,"Dell","PIE2ED3",27000)); 
		listOfLaptop.add(new Laptop(2651,"Asus","PIE2ED3",27000)); 
		listOfLaptop.add(new Laptop(2981,"Apple","PIE2ED3",27000)); 
		listOfLaptop.add(new Laptop(2323,"HP","PIE2ED3",27000)); 
		listOfLaptop.add(new Laptop(3454,"Acer","PIE2ED3",27000)); 
		listOfLaptop.add(new Laptop(2832,"Lenovo","PIE2ED3",27000)); 

		
		for(Laptop val : listOfLaptop) {
			System.out.println(val);
		}
		
	}

}
