package InterviewPrograms;

public class SecondLargestNum {

	public static int findSecondLargestNum(int arr[]){
		int first=Integer.MIN_VALUE, second= Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>first) {
				second=first;
				first=num;
			} else if(num>second && num!=first) {
				second=num;
			}
		}
		return second;
		
		
	}
	
	public static void main(String[] args) {
		int arr[]= {2,45,12,45,43,6,78,5};
		int secondLargeNum=findSecondLargestNum(arr);
		System.out.print(secondLargeNum);
}
}
