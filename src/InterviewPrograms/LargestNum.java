package InterviewPrograms;

// This class finds and returns the largest number in an integer array.
// Useful for practicing array traversal and comparison logic in Java interviews.

public class LargestNum {

	public static int findLargestNum(int arr[]){
		int largeNum=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(largeNum<arr[i]) {
				largeNum=arr[i];
			}
		}
		
		return largeNum;
	}
	
	public static void main(String[] args) {
		int arr[]= {2,45,12,43,6,78,5};
		int largeNum=findLargestNum(arr);
		System.out.print(largeNum);
}
}
