package InterviewPrograms;

public class PrintEachLetterTwiceInString {
    
    public static String display(String str) {
        // Using StringBuilder for better performance in loops
        StringBuilder doubleStr = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            doubleStr.append(c).append(c); // Append character twice
        }
        
        return doubleStr.toString(); // Convert back to String
    }

    public static void main(String[] args) {
        String str = "HELLO";
        String doubleStr = display(str);
        System.out.print(doubleStr);
    }
}
