package InterviewPrograms;

public class MergeLetterDigitAlternate {

	public static void main(String[] args) {
		String str="ABCD";
		String str1="123456";
		display(str, str1);

	}

	private static void display(String str, String str1) {
		StringBuilder sb= new StringBuilder();
		int i=0, j=0;
		while(i<str.length() || j<str1.length()) {
			
			if(i<str.length()) {
				sb.append(str.charAt(i));
				i++;
			}
			if(j<str1.length()) {
				sb.append(str1.charAt(j));
				j++;
			}
		}
		System.out.println("Output: "+sb.toString());
		
	}

}
