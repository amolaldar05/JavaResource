package InterviewPrograms;

public class ReverseStringExample {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = reverseStringUsingLoop(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseStringUsingLoop(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder reversedString = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedString.append(charArray[i]);
        }
        return reversedString.toString();
    }
}

