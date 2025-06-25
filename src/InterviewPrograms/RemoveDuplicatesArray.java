package InterviewPrograms;

// This class finds and prints duplicate elements in an integer array.
// Useful for practicing use of HashSet and duplicate detection in Java interviews.

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesArray {

	public static void duplicateEle(int arr[]) {

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num); // if add() returns false, it's a duplicate
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,3,4,3,2,1,5};
		duplicateEle(arr);

	}

}
