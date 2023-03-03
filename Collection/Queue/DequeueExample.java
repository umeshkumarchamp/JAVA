package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {

	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<>(); 
		
		deque.offer(23); 
		deque.offer(89); 
		deque.offer(74); 
		deque.offer(12); 
		deque.add(77); 
		deque.add(34); 
		deque.offer(97); 
		
		deque.forEach(val -> System.out.print(val+" "));
		
		//deque.offerFirst(11); 
		System.out.println("\nOffer First : "+ deque.offerFirst(11));
		deque.forEach(val -> System.out.print(val+" "));
		
		//deque.offerLast(99); 
		System.out.println("\nOffer Last : "+deque.offerLast(99));
		deque.forEach(val -> System.out.print(val+" "));
		
		
		System.out.println("\nPeek : "+deque.peek());
		deque.forEach(val -> System.out.print(val+" "));
		
		System.out.println("\nPoll : "+deque.poll());
		deque.forEach(val -> System.out.print(val+" "));
		
		System.out.println("\nPoll First : "+deque.pollFirst());
		deque.forEach(val -> System.out.print(val+" "));
		
		System.out.println("\nPoll Last : "+ deque.pollLast());
		deque.forEach(val -> System.out.print(val+" "));
		

		
		
		
	}

}
