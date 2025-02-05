package InterviewPrograms;

public class PalindromeNum {

	public static void main(String[] args) {
		int originalNum=121;
		int number=originalNum;
		int reverseNum=0;
		int remainder;
		
		 // Reverse the number
        while (number > 0) {
            remainder = number % 10;
            reverseNum = (reverseNum * 10) + remainder;
            number = number / 10;
        }
        
        // Check if the original number is equal to the reversed number
        if (originalNum == reverseNum) {
            System.out.println("Given number is a palindrome");
        } else {
            System.out.println("Given number is not a palindrome");
        }

	}

}
