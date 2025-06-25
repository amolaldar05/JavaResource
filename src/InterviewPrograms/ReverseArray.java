package InterviewPrograms;

import java.util.Arrays;

public class ReverseArray {
    
    public static void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        
        while(left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move pointers
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        reverseArray(arr);
        
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
