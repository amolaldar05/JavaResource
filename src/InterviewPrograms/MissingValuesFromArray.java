package InterviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class MissingValuesFromArray {

	public static List<Integer> findMissingValues(int[] sortedArray) {
		List<Integer> missingValues = new ArrayList<>();

		for (int i = 0; i < sortedArray.length - 1; i++) {
			int current = sortedArray[i];
			int next = sortedArray[i + 1];

			// Check if there is a gap between the current element and the next element
			if (next - current > 1) {
				// Add all missing values between current and next
				for (int j = current + 1; j < next; j++) {
					missingValues.add(j);
				}
			}
		}

		return missingValues;
	}

	public static void main(String[] args) {
		int[] sortedArray = { 1, 2, 4, 7, 10 };

		List<Integer> missingValues = findMissingValues(sortedArray);

		if (missingValues.isEmpty()) {
			System.out.println("No missing values found.");
		} else {
			System.out.println("Missing values: " + missingValues);
		}
	}
}
