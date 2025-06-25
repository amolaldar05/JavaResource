package InterviewPrograms;

// This class separates and prints uppercase and lowercase letters from a given string.
// Useful for practicing character classification in Java interviews.

import java.util.ArrayList;
import java.util.List;

public class CaseSensitiveUppeLowercase {

	public static void seperateLetters(String str) {
		List<Character> upperCase= new ArrayList<>();
		List<Character> lowerCase= new ArrayList<>();
		char[] ch=str.toCharArray();
		for(char c:ch) {
			if(Character.isLowerCase(c)) {
				lowerCase.add(c);
			}else {
				upperCase.add(c);
			}
		}
		upperCase.stream().forEach(System.out::print);
		System.out.println("");
		lowerCase.stream().forEach(System.out::print);
	}
	public static void main(String[] args) {
		String str="AvAcsDewQ";
		seperateLetters(str);
	}

}
