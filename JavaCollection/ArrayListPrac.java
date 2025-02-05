package JavaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPrac {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Amol");
		list.add("Sneha");
		list.add("Amol");
		list.add("Amol");
		
		for(String l:list) {
			System.out.println(l);
		}
		
/*		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(list.get(1));
		}*/
		
	}
}
