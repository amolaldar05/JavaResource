package InterviewPrograms;

import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "java sql java python java python";

		// Split the input string and add to a LinkedHashSet to remove duplicates
		LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(List.of(str.split(" ")));

		// Join the unique words into a single string with spaces
		String result = String.join(" ", uniqueWords);

		System.out.println(result);
	}
}
