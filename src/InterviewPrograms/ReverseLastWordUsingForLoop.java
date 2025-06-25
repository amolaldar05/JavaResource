package InterviewPrograms;

public class ReverseLastWordUsingForLoop {
	

	    public static String reverseLastWord(String str) {
	        String[] words = str.split(" ");
	        //StringBuilder result = new StringBuilder();
	        String newStr="";

	        for (int i = 0; i < words.length; i++) {
	        	if(i!=words.length-1) {
	        		newStr+=words[i]+" ";
	        	}
	        	else {
	        		char[] ch=words[i].toCharArray();
	        		for(int j=ch.length-1;j>=0;j--) {
	        			newStr+=ch[j];
	        		}
	        	}
	        	}
	        return newStr;
	        }
	    

	    public static void main(String[] args) {
	        String str = "Amol Popat Aldar";
	        String output = reverseLastWord(str);
	        System.out.print("Output: " + output+" ");
	    }
	}


