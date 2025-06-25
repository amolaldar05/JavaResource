package InterviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class PrintLetters {

	public static void display(String str) {
		StringBuilder sb = new StringBuilder();
		List<Integer> digit = new ArrayList<>();
		List<Character> letter = new ArrayList<>();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				letter.add(ch[i]);
			} else {
				digit.add(Character.getNumericValue(ch[i]));
			}
		}

		for (int i = 0; i < letter.size(); i++) {
			for (int j = 0; j < digit.get(i); j++) {
				sb.append(letter.get(i));
			}
		}
		System.out.println("Output: "+sb.toString());
	}

	public static void main(String[] args) {
		String str = "a3b9";
		display(str);

	}

}
