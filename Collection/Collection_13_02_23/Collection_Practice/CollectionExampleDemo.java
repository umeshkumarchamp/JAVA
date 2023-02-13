package Collection_Practice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionExampleDemo {

	public static void main(String[] args) {

		// METHODS : 
			// collections.sort(collection)
			// collections.suffle(ListName) Randomly choose an element from the list.. 
			// collections.reverse(List myList)
			// collections.binarySearch(List myList)
			// Collections.copy(dest, src)
			// Collections.addAll(_,_,_)
		
		List<String> list = new LinkedList<>();
		list.add("HP"); 
		list.add("DELL"); 
		list.add("ASUS"); 
		list.add("APPLE"); 
		list.add("SONY"); 
		list.add("MSI"); 
		// printing list
		
		System.out.println("\nOriginal list : \n"+list);
		Collections.sort(list);
//		// print list after sorting 
		System.out.println("\nSorted List :\n"+list);
//		
		Collections.reverse(list);
		 
		System.out.println("\nReverse list : \n"+list);

		
		
//		LinkedList<Integer> Pricelist = new LinkedList<>(); 
//		Pricelist.add(23000);
//		Pricelist.add(50000); 
//		Pricelist.add(35000); 
//		Pricelist.add(40000); 
//		
//		System.out.println(Pricelist);
//		
//		Collections.sort(Pricelist, Collections.reverseOrder());
//		System.out.println(Pricelist);
//		
		

//		// SUFFLE METHOD..
		System.out.println("\nWithout Shuffle Method : "+list);
		Collections.shuffle(list);
		System.out.println("\nWith Shuffle Method : ");
		Iterator<String> itr = list.iterator(); 
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
//		
		
		// BINARY SEARCH ....
		
		
//		System.out.println("\nSorted list : ");
//		System.out.println(list);
//		Scanner sc = new Scanner(System.in); 
//		System.out.print("Enter search element : ");
//		String element = sc.nextLine();
		Collections.sort(list);
		int index = Collections.binarySearch(list, "APPLE");
		System.out.println("\n\nBINARY SEARCH : ");
		System.out.println("APPLE is found at index "+index+"th.");
//		sc.close();
//		
//		// Collections.copy(dest, src)
		
		List<String> newList = new LinkedList<>(); 
//		//Collections.copy(newList, list);
//		
		newList.forEach(val -> System.out.println(val));
//		
//		
//		// Collections.addAll method
		
		Collections.addAll(newList, "MI","REALME","SAMSUNG"); 
		
		System.out.println("\nMy new List is : "+newList);
		
		
//		// Collections.fill method...
		System.out.println();
		Collections.fill(list, "Umesh");
		System.out.println(list);
//		
		
		
	}

}
