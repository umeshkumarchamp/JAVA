package Queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new PriorityQueue<>();
		//Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder()); 
//		queue.add(23); 
//		queue.add(89); 
		
		
		
		
//		queue.offer(298); 
//		
//		queue.forEach(val -> System.out.println(val));
//		
		Collections.addAll(queue, 655,282,481,749,482);
		System.out.println("My Queue : ");
		queue.forEach(val -> System.out.print(val+" "));
		queue.poll(); 
		int remove = queue.peek(); 
		System.out.println();
		System.out.println("\nAfter Poll : ");
		queue.forEach(val -> System.out.print(val+" "));
		
		Queue<String> str = new PriorityQueue<>(); 
		str.offer("Manish"); 
		str.offer("Umesh"); 
		str.offer("Om");
		str.offer("Atul"); 
		str.offer("Sweta"); 
		str.offer("Mango"); 
		 
		
		System.out.println("\nMy List : ");
		str.forEach(val -> System.out.print(val+" "));
		
	}

}
