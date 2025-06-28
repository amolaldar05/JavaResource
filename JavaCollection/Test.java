package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void isAnagram(int arr[], int target) {
		int n= arr.length;
		List<List<Integer>> result = new ArrayList<>();
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==target) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {2, 3, 5, 6, 7, 9};
		isAnagram(arr, 15); // Example target value
	}
}
