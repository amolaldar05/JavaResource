package InterviewPrograms;

public class MinAndMaxNumFromArray {
	
	public static void displayMinAndMaxNum(int arr[]){
		int min=arr[0];
		int max=arr[0];
		for(int num:arr) {
			if(min>num) {
				min=num;
			}
		}
		for(int num:arr) {
			if(max<num) {
				max=num;
			}
		}
		
		System.out.println(min+": is min num "+max+": is max num");
	}

	public static void main(String[] args) {
		int arr[]= {1,3,2,3,4,3,2,3,4,5,6,6,7,8,7,6};
		displayMinAndMaxNum(arr);

	}

}
