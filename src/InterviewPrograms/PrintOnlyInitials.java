package InterviewPrograms;

public class PrintOnlyInitials {

	
	public static void displayIntialLetter(String name) {
		String[] str=name.split("\\s");
		//char[] ch = null;
		for(String s: str) {
			char[] ch=s.toCharArray();
			System.out.print(ch[0]);
		}
		
	}
	public static void main(String[] args) {
		String name="sAmol Popat Aldar";
		displayIntialLetter(name);

	}

}
