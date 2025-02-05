package InterviewPrograms;

import java.util.Scanner;

public class RemoveDuplicateCharFromString {
	static int count;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		String str = sc.nextLine();
		
		
		String newstr="";
		for(int i=0;i<str.length();i++) {
			String ch=""+str.charAt(i);
			if(!newstr.contains(ch)) {
				newstr+=ch;
				count++;
				
			}
			
		}
		System.out.print(newstr+" "+count);
		

	}

}
