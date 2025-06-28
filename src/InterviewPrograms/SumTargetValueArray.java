package InterviewPrograms;

//Write a program to find triplets in an array. For example:
//Given `a[] = {2, 3, 5, 6, 7, 9}`, find combinations where the sum of any two elements equals a target value.
public class SumTargetValueArray {
	public static void findTriplets(int arr[], int target) {
		int n = arr.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {2, 3, 5, 6, 7, 9};
		findTriplets(arr, 15); // Example target value

	}

}



