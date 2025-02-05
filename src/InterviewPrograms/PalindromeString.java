package InterviewPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		//sc.nextInt();
		String name = sc.nextLine();

		// String name="amol";
		char[] ch = name.toCharArray();
		String rev = "";
		// ArrayList a= new ArrayList();
		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + (ch[i]);

		}
		System.out.print(rev);
		if (name.equals(rev)) {
			System.out.println(": Palindrome String");
		} else {
			System.out.println(": not Palindrome String");
		}
		sc.close();
	}
	

}
