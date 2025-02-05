package InterviewPrograms;

public class ReverseString {
	public static void main(String[] args) {
		String originalString = "Hello, World!";
		String reversedString = reverseStringUsingStreams(originalString);
		System.out.println("Original String: " + originalString);
		System.out.println("Reversed String: " + reversedString);
	}

	public static String reverseStringUsingStreams(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
