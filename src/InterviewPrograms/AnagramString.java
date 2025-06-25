package InterviewPrograms;

// This class checks if two strings are anagrams of each other (case-insensitive).
// Demonstrates string sorting and comparison for interview questions.

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class AnagramString {
	
	public static boolean isStringscheckAnagram(String str,String str1) {
		str= str.toLowerCase();
		str1= str1.toLowerCase();
		if(str.length()!=str.length()) {
			return false;
		}
		else {
			
			char[] ch= str.toCharArray();
			char[] ch1=str1.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			if(Arrays.equals(ch, ch1)==true) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str="acep";
		String str1="Pace";
		boolean a=isStringscheckAnagram(str,str1);
		System.out.print(a);

	}

}
