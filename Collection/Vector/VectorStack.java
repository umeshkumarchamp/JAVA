package Vector;

import java.util.Stack;

public class VectorStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Object> stack = new Stack<>(); 
		stack.push("Umesh"); 
		stack.push("Sweta");
		stack.push("Manish"); 
		 
		
		System.out.println(stack);
		
		// Removing data from the stack...
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
	}

}
