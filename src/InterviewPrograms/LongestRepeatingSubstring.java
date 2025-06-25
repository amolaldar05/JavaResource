package InterviewPrograms;

// This class finds the longest repeating substring within a given string.
// Useful for practicing substring search and string manipulation in Java interviews.

public class LongestRepeatingSubstring {

    public static String findLongestRepeatingSubstring(String str) {
        int n = str.length();
        String longest = "";

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = str.substring(i, j);
                // Check if this substring appears again later
                if (str.indexOf(sub, i + 1) != -1) {
                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String input = "banana";
        String result = findLongestRepeatingSubstring(input);
        System.out.println("Longest Repeating Substring: " + result);
    }
}
