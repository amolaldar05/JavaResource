package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateStringFromArray {
	
	public static void removeDuplicates(String arr[]) {
		Set<String> al= new TreeSet<>();
		for(String name:arr) {
			al.add(name);
		}
		int unique=0;
		String result[]= new String[al.size()];
		
		for(String a:al) {
			result[unique]=a;
			unique++;
		}
		System.out.println(Arrays.toString(result));
	}
	
	public static void main(String[] args) {
		String arr[]= {"Amol", "Popat", "Aldar","Aldar"};
		removeDuplicates(arr);
	}

}
