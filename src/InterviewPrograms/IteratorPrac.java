package InterviewPrograms;

// This class demonstrates the use of Iterator to remove elements from a collection while iterating.
// Useful for practicing safe removal of elements during iteration in Java interviews.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorPrac {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(2);
		al.add(5);
		al.add(12);
		al.add(9);
		al.add(15);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()) {
			Integer num=it.next();
			if(num>10) {
				it.remove();
			}
			
		}
		System.out.println(al);
		
		String[] names= {"Amol", "Aldar","kuwgdkihh"};
		ArrayList<String> al1= new ArrayList<String>(Arrays.asList(names));
		al1.removeIf(name->name.length()>5);
//		Iterator<String> it1=al1.iterator();
//		while(it1.hasNext()) {
//			String name=it1.next();
//			int len=name.length();
//			if(len>5) {
//				it1.remove();
//			}
//		}
		System.out.println(al1);
		
		
		
	} 
	
	
	
	
	

}
