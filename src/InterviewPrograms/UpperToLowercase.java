package InterviewPrograms;

// This class converts uppercase letters to lowercase and vice versa in a given string.
// Useful for practicing character case conversion in Java interviews.

public class UpperToLowercase {
    // Method to reverse the case of each character in the string
    public static void reverseCase(String str) {
        // Convert the input string to a character array
        char[] ch = str.toCharArray();
        // Initialize an empty string to store the result
        String lowerLetter = "";
        // Iterate through each character in the array
        for (char c : ch) {
            // If the character is uppercase, convert to lowercase
            if (Character.isUpperCase(c)) {
                lowerLetter += Character.toLowerCase(c);
            // If the character is lowercase, convert to uppercase
            } else if (Character.isLowerCase(c)) {
                lowerLetter += Character.toUpperCase(c);
            } 
        }
        // Print the result string with reversed cases
        System.out.print(lowerLetter);
    }

    // Main method to test the reverseCase function
    public static void main(String[] args) {
        // Input string with mixed case
        String str = "HexAwarE";
        // Call the reverseCase method
        reverseCase(str);
    }

}
