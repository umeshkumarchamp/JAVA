package Map_Interface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		System.out.println("\n********** Hash Map **********\n");
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Umesh");
		map.put(2, "Atul");
		map.put(3, "Roshan");
		map.put(4, "Gautam");
		
		for(Map.Entry<Integer, String> val : map.entrySet()) {
			System.out.println(val.getKey() +" : "+val.getValue());
		}
		
		System.out.println(map.toString());
		System.out.println(map.get(1));
		
		map.putIfAbsent(1, "Manish");
		System.out.println(map.containsKey(9));
		System.out.println(map.containsValue("Umesh"));
		
		if(map.containsKey(4)) {
			System.out.println("Key is present");
		}
		else {
			System.out.println("Key is not present.");
		}
		
		System.out.println("\n********** Linked Hash Map **********\n");
		
		Map<String, Integer> map2 = new LinkedHashMap<>(); 
		map2.put("Umesh",35000); 
		map2.put("Atul", 30000);
		map2.put("Roshan",30000); 
		map2.put("Gautam", 40000); 
		
		for(Map.Entry<String, Integer> val: map2.entrySet()) {
			System.out.println(val.getKey() + " : "+val.getValue());
		}
		
		
		System.out.println("\n********** Tree Map **********\n");
		Map<String, Integer> map3 = new TreeMap<>(); 
		map3.put("Umesh",35000); 
		map3.put("Atul", 30000);
		map3.put("Roshan",30020); 
		map3.put("Gautam", 48900); 
		map3.put("Manish",35450); 
		map3.put("Muskan", 37400);
		map3.put("Sweta",34500); 
		map3.put("Khushboo", 40000); 
		map3.put("Tinki",30000); 
		map3.put("Priya", 40000);
		
		for(Map.Entry<String, Integer> val :map3.entrySet()) {
			System.out.println(val.getKey()+" : "+val.getValue());
		}
		
		
		
//		for(Integer val : map.keySet()) {
//			System.out.println(val);
//		}
//		
//		for(String val : map.values()) {
//			System.out.println(val);
//		}
//		
	}
	
}
