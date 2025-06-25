package InterviewPrograms;

public class StringPermutations {
	

	    // Recursive function to generate permutations
	    public static void generatePermutations(String str, String result) {
	        // Base case: if input string is empty, print the result
	        if (str.length() == 0) {
	            System.out.println(result);
	            return;
	        }

	        // Loop through the string
	        for (int i = 0; i < str.length(); i++) {
	            // Take one character out
	            char ch = str.charAt(i);

	            // Remaining string after removing the character
	            String remaining = str.substring(0, i) + str.substring(i + 1);

	            // Recurse with remaining string and result + current char
	            generatePermutations(remaining, result + ch);
	        }
	    }

	    public static void main(String[] args) {
	        String input = "ABC";
	        System.out.println("Permutations of " + input + " are:");
	        generatePermutations(input, "");
	    }
	}


