package InterviewPrograms;

public class ReverseLastWord {

    public static String reverseLastWord(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                // Reverse the last word
                String lastWord = words[i];
                StringBuilder rev = new StringBuilder(lastWord).reverse();
                result.append(rev);
            } else {
                result.append(words[i]).append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Amol Popat Aldar";
        String output = reverseLastWord(str);
        System.out.println("Output: " + output);
    }
}
