package InterviewPrograms;

import java.util.Scanner;

public class PrintInitialLetters {

	public static void getNameInitials() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your fullname: ");
		String fullName = sc.nextLine();

		String[] names = fullName.trim().split(" ");
		StringBuilder builder = new StringBuilder();
		for (String name : names) {
			builder.append(name.charAt(0)).append(".");
		}
		System.out.print(builder.toString().toUpperCase());
		sc.close();

	}

	public static void main(String[] args) {
		PrintInitialLetters.getNameInitials();

	}

}
