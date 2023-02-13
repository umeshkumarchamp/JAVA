package MobileProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m1 = new Mobile(101,"Realme",8375939,180);
		Mobile m2 = new Mobile(123,"Redmi",8275345,190);
		Mobile m3 = new Mobile(111,"iphone",8385723,170); 
		Mobile m4 = new Mobile(100,"Samsung",2834727,188); 
		
		List<Mobile> mobileList = new ArrayList<>(); 
		
		Collections.addAll(mobileList, m1,m2,m3,m4); 
		System.out.println("List Before Sorting : ");
		Iterator<Mobile> itr = mobileList.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
		Collections.sort(mobileList);
		
		System.out.println("\nList Sorted By Mobile Id : ");
//		Iterator<Mobile> i = mobileList.iterator(); 
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
		mobileList.forEach(abc-> System.out.println(abc));

		
		
	}

}
