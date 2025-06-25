package InterviewPrograms;

import java.util.Arrays;

public class RemoveDuplicatesEle {

	public static void removeDuplicates(int[] arr, int[] temp) {
		int uniqueEle = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean idDuplicate = false;
			for (int j = 0; j < uniqueEle; j++) {
				if (arr[i] == temp[j]) {
					idDuplicate = true;
					break;
				}
			}
			if (!idDuplicate) {
				temp[uniqueEle++] = arr[i];
			}
		}
		for (int i = 0; i < uniqueEle; i++) {
			System.out.print(temp[i] + " ");
		
		}
		Arrays.sort(temp);
		//Array after sorting
		for (int i = 0; i < uniqueEle; i++) {
			System.out.print(temp[i] + " ");
		
		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 1, 3, 5, 3, 4, 7, 6, 8, 5, 7, 5, 9, 0 };
		int temp[] = new int[arr.length];
		removeDuplicates(arr, temp);

	}

}
