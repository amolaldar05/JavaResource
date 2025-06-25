package InterviewPrograms;

// This class separates digits and letters from a string and prints them individually.
// Useful for string manipulation interview questions.

import java.util.ArrayList;
import java.util.List;

public class AlphaNum {

    public static void main(String[] args) {
        String str = "AB1C2D";

        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c);
            } else if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        System.out.print("Digits: ");
        digits.forEach(System.out::print);

        System.out.print("\nLetters: ");
        letters.forEach(System.out::print);
    }
}
