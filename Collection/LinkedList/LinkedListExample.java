package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList1 = new LinkedList<>();
		LinkedList<Integer> linkedList2 = new LinkedList<>(); 
		
		//linkedList.add("Umesh");
		//System.out.println(linkedList.get(0));
		// update the value at index 0
		//linkedList.add(0, "Dinesh");
		
		linkedList1.add(78);
		linkedList1.add(66); 
		linkedList1.add(23);
		linkedList1.add(89);
		linkedList1.offer(888); 
		linkedList1.offerFirst(1999); 
		
		linkedList2.add(27); 
		linkedList2.add(1, 99);
		linkedList2.addFirst(111);
		linkedList2.addLast(1000);
		
		
		// Traverse the list using toString() method...
		System.out.println("\nUsing toString() method");
		System.out.println(linkedList1.toString());
		System.out.println(linkedList1.contains(99));
		// top get element.. 
		System.out.println(linkedList1.peek());
		// poll is used to remove an element from the list.
		System.out.println(linkedList1.poll());
		System.out.println(linkedList1.toString());
		Object[] arr = linkedList1.toArray(); 
		System.out.println(arr);
		// for clone
		LinkedList<Integer> newList = (LinkedList<Integer>) linkedList1.clone(); 
		System.out.println("Clone List\n"+newList.toString());
		
		
		
		System.out.println("\nLinked list 2 : ");
		System.out.println(linkedList2.toString());
		System.out.println(linkedList2.containsAll(linkedList1));
		System.out.println("Last element :"+linkedList2.getLast());
		
		
//		// Traverse the list using for loop...
//		System.out.println("\nUsing inhanced For Loop");
//		for(Integer val : linkedList) {
//			System.out.println(val);
//		}
//		
//		// Traverse the list using iterator 
//		System.out.println("\nUsing Iterator ");
//		Iterator<Integer> itr = linkedList.iterator(); 
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		// Using normal for loop..
//		System.out.println("\nUsing normal for loop");
//		for(int i =0; i<linkedList.size(); i++) {
//			System.out.println(linkedList.get(i));
//		}
		
	}

}
