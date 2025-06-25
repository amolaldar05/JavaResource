package InterviewPrograms;

// This class counts and prints duplicate numbers in an integer array.
// Useful for practicing use of HashMap and frequency counting in Java interviews.

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {

	public static void getDuplicateNum(int[] arr) {
		Map<Integer, Integer> map= new HashMap<>();
		
		
		for(int num:arr) {
			map.put(num,map.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(map);
				break;
				//System.out.println(entry.getKey()+": "+entry.getValue());
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,2,4,5,6,7,5,4,5,6,7,5,4,3,3};
		getDuplicateNum(arr);

	}

}
