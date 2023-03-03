package SET;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nHashSet : NotPreserved ");
		Set<Integer> set = new HashSet<>(); 
		Collections.addAll(set, 23,64,34,12,78); 
		System.out.println(set.add(78));
		Iterator<Integer> itr = set.iterator(); 
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\nLinkedHashSet : Preserved ");
		Set<Integer> set2 = new LinkedHashSet<>(); 
		Collections.addAll(set2, 645,383,585,298,892,482); 
		Iterator<Integer> i = set2.iterator(); 
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		List<Integer> list = new ArrayList<>(); 
		Collections.addAll(list, 78,89,13,53,23); 
		
		System.out.println("\nTree Set : ");
		Set<Integer> tset = new TreeSet<>(list); 
		Collections.addAll(tset, 3,9,5,1,0,4,7); 
		tset.forEach(val -> System.out.print(val+" "));
		
	}

}
