package InterviewPrograms;

public class ReverseEachWord {
	
	public static void displayReverseWord(String name) {
		String[] strSplitted = name.split("\\s");
		
		for (String word : strSplitted) {
			String revWord = ""; // Move inside the loop to reset for each word
			char[] ch = word.toCharArray();
			for (int i = ch.length - 1; i >= 0; i--) {
				revWord += ch[i];
			}
			System.out.print(revWord + " "); // Add space after each reversed word
		}
	}

	public static void main(String[] args) {
		String name = "Amol Popat Aldar";
		displayReverseWord(name);
	}
}
