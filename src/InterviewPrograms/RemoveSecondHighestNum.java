package InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RemoveSecondHighestNum {

	public static void main(String[] args) {
		//Hashmap 
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);
		map.put(5, 50);
		System.out.println("Original HashMap: " + map); //printing original Hashmap
		List<Integer> values = new ArrayList<Integer>(map.values()); //Retrive all values
		Collections.sort(values, Collections.reverseOrder()); //sorting descending order
		Integer secondHighestNum=values.get(1); //find second highest value
		// Step 4: Remove the entry with the second-highest value
        // Iterate over the entrySet to find and remove the entry with the second-highest value
		 for (Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator(); it.hasNext(); ) {
	            Map.Entry<Integer, Integer> entry = it.next();
	            if (entry.getValue() == secondHighestNum) {
	                it.remove(); 
	                break; 
	            }
	            
	}
		 System.out.println("Updated HashMap after removing second-highest: " + map);

}
}
