package InterviewPrograms;

// This class implements the binary search algorithm to find the index of a target value in an array.
// Useful for demonstrating efficient search techniques in interviews.

public class BinarySearch {
	public static int display(int arr[],int target) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		// If the target is not found in the array, return -1 to indicate absence
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[]= {10,20,40,50,90,60};
		int result=display(arr,50);
		System.out.println("Index: " + result);
	}

}
