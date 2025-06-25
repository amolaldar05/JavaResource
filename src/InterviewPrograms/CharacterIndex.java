package InterviewPrograms;

// This class finds and prints the first and last occurrence of the character 'a' in a string.
// Useful for practicing string traversal and index finding in Java interviews.

public class CharacterIndex {

    public static void displayIndexe(String str) {
        int firstIndex = -1;
        int lastIndex = -1;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i; // keep updating until the last 'a'
            }
        }

        if (firstIndex != -1) {
            System.out.println("First occurrence of 'a' at index: " + firstIndex);
            System.out.println("Last occurrence of 'a' at index: " + lastIndex);
        } else {
            System.out.println("'a' not found in the string.");
        }
    }

    public static void main(String[] args) {
        String str = "amazonaanazzz";
        displayIndexe(str);
    }
}
