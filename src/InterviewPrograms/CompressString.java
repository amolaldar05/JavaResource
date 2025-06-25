package InterviewPrograms;

// This class compresses a string by counting consecutive repeating characters.
// Useful for practicing string manipulation and run-length encoding in interviews.

public class CompressString {
    
    public static String compress(String str) {
    	 StringBuilder result = new StringBuilder();
         char[] ch=str.toCharArray();
         int count=1;
         for(int i=0;i<ch.length-1;i++) {
      	   if(ch[i]==ch[i+1]) {
      		   count++;
      	   }else {
      		   result.append(ch[i+1]).append(count);
      		   count=1;// reset count for the new character
      	   }
      	   
         }
      // Append the last character group
         result.append(ch[ch.length-1]).append(count);
         return result.toString();
          }
    	
       
    
    public static void main(String[] args) {
        String input = "aabbcccdd";
        String output = compress(input);
        System.out.println("Output: " + output);
    }
}
