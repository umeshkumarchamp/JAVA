package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> myList = new LinkedList<>(); 
		
		myList.add("Umesh"); 
		myList.add("Sweta"); 
		myList.add("Manish"); 
		myList.add("Aakash");
		
		// Traverse the list using toString..
		System.out.println("\nTraverse the list using toString() ");
		System.out.println(myList.toString());
		
		// Traverse the list using inhanced for loop.
		System.out.println("\nTraverse the list using Inhanced for loop ");
		for(String s : myList) {
			System.out.println(s);
		}
		
		// Traverse the list using normal for loop. 
		System.out.println("\nTraverse the list using normal for loop ");
		for(int i=0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		// Traverse the list using Iterator. 
		System.out.println("\nTraverse the list using iterator ");
		Iterator<String> itr = myList.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
