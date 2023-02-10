package Vector;

import java.util.List;
import java.util.Vector;

public class App {

	public static void main(String[] args) {
		/*
		List |
			 |
		   1. ArrayList  [ Not Synchronized ]
		   2. LinkedList [ Not Synchronized ]
		   3. Vector -> Stack , Legecy Class [ Synchronized ] 
		   
		 */
		
		Object arr[] = {"Umesh",23,"MCA",6201033951l}; 
		
		List<Object> vector = new Vector<>();
		vector.add(arr); 
		System.out.println(vector);
		
		
		List<Integer> v2 = new Vector<>(); 
		v2.add(10); 
		v2.add(12); 
		v2.add(13); 
		
		
		v2.add(1, 222);
		
		
		
		
//		Vector v1 = new Vector<>();
//		
//		List<String> v2 = new Vector<>(); 
//		
//		Vector<Integer> v3 = new Vector<>();  
//		
		

	}

}
