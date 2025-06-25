package InterviewPrograms;

// This class finds and prints the first non-repeating character in a string.
// Useful for practicing character frequency counting and map usage in Java interviews.

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingLetter {
	
	public static void displayNonRepeatChar(String str) {
		char[] ch=str.toCharArray();
		Map<Character,Integer> map= new HashMap<>();
		for(char c:ch) {
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.print(entry.getKey());
				break;
			}
		}
	}

	public static void main(String[] args) {
		String str= "swiss";
		displayNonRepeatChar(str);

	}

}
