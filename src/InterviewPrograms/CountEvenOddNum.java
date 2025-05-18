package InterviewPrograms;

public class CountEvenOddNum {
	public static int count(int[] arr) {
		int count=0;
		for(int num:arr) {
			if(num%2==0) {
				
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr= {34,54,11,67,45,98,99};
		int totalEvenCount=count(arr);
		System.out.println("Even Count: "+totalEvenCount);
		System.out.println("Odd Count: "+(arr.length-totalEvenCount));

	}

}
