package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumbersInSet {
	public static void  main(String[] args) {
		Set<String> set= new HashSet<String>();
		set.add("Amol");
		set.add("Aldar");
		int number[]= {1,4,8};
		String names[]= {"Amol","Poapt", "Aldar"};
		ArrayList<String> listNames=new ArrayList<String>(Arrays.asList(names));
		for(String name: set) {
			if(listNames.contains(name)) {
				System.out.println(name+": present");
			} else {
				System.out.println(name+": not present");
			}
		}
		
		for(int i=0; i<10; i++) {
			if(i==number[i]) {
				System.out.println(number[i]);
			}else {
				System.out.println(number[i]);
			}
		}
		
	}

}
