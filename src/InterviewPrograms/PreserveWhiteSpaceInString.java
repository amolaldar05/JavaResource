package InterviewPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class PreserveWhiteSpaceInString {
	
	public static void maintainSpaceInReverseString(String userName) {
		// Store the positions of spaces
		ArrayList<Integer> spaceIndexes = new ArrayList<>();
		char[] ch = userName.toCharArray();
		
		// Identify the positions of all spaces
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				spaceIndexes.add(i);
			}
		}
		
		// Create a result array of the same length
		char[] result = new char[ch.length];
		
		// Fill the spaces in the result array
		for (int index : spaceIndexes) {
			result[index] = ' ';
		}
		
		// Reverse the characters, skipping the spaces
		int j = ch.length - 1;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				// Find the next non-space position from the end
				while (j >= 0 && result[j] == ' ') {
					j--;
				}
				result[j] = ch[i];
				j--;
			}
		}
		
		// Print the final result
		System.out.println("Reversed String with spaces preserved: " + new String(result));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String userName = sc.nextLine();
		maintainSpaceInReverseString(userName);
		sc.close();
	}
}
