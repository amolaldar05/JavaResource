package InterviewPrograms;

// This class counts the number of characters in a string, excluding spaces.
// Useful for practicing string traversal and filtering in Java interviews.

public class CountChar {
	
	//Count String char without space
	public static int isPrime(String str) {
		int len=str.length();
		char[] ch=str.toCharArray();
		int count=0;
		String str1="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				 str1+=ch[i];
				count++;
			}
		}
		System.out.println(str1);
		return count;
		
	}

	public static void main(String[] args) {
		String str="Amol Aldar";
		int count=isPrime(str);
		System.out.println("count: "+count);

	}
}
