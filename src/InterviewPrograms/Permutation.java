package InterviewPrograms;

public class Permutation {

	
	public static void generatePurmute(String str,String result) {
		if(str.length()==0) {
			System.out.println(result);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i); 
			String rem=str.substring(0,i)+str.substring(i+1);
			generatePurmute(rem, result+ch);
		}
	
	}
	public static void main(String[] args) {
		String str="ABC";
		
		generatePurmute(str,"");
		
	}

}
