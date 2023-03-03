package CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> oldstudent = new ArrayList<>(); 
		oldstudent.add("Dinesh"); 
		oldstudent.add("Manish"); 
		oldstudent.add("Atul"); 
		
		ArrayList<String> studentName = new ArrayList<>();
		//List<String> studentNames = new ArrayList<>(); 
		studentName.add("Umesh"); 
		studentName.add("Champ"); 
		
		studentName.addAll(oldstudent); 
		
		
		for(String v : studentName) {
			System.out.println(v);
		}
		
		System.out.println(studentName.isEmpty());
		System.out.println(studentName.get(2));
		System.out.println(studentName.contains("Atul"));
		System.out.println(studentName.containsAll(oldstudent));
		System.out.println("The List is Empty : "+studentName.isEmpty());
		//studentName.clear();
		//System.out.println("The List is Empty : "+studentName.isEmpty());
		
		// Traverse the list using toString method...
		System.out.println("\nTraverse the list using toString method : ");
		System.out.println(studentName.toString());
		System.out.println("Index of Manish : "+studentName.indexOf("Manish"));
		
		// using iterator to traverse the list..
		System.out.println("\nTraverse the list using Iterator : ");
		Iterator<String> itr = studentName.iterator(); 
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		// Remove element from the list...
		System.out.println("\nRemoving list from the list : ");
		System.out.println("\nBefore removing element : ");
		System.out.println(studentName.toString());
		System.out.println("\nAfter Removing element : ");
		studentName.remove(0); 
		System.out.println(studentName.toString());
		
		studentName.set(0, "Muskan"); 
		
		System.out.println(studentName.toString());
		
		studentName.add(0,"Dodo"); 
		
		System.out.println(studentName.toString());
		
		// Traverse the list using for loop..
		System.out.println("\nTraverse the list using for loop : ");
		for(int i =0; i<studentName.size(); i++) {
			System.out.print(studentName.get(i)+" ");
		}
		
		Collections.sort(studentName);
		
		System.out.println(studentName.toString());
		
	}

}
