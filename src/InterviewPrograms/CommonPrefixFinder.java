package InterviewPrograms;

import java.util.Arrays;

public class CommonPrefixFinder {

	public static String findPrefix(String arr[]) {
		if (arr == null || arr.length == 0) {
			return "";
		}
		Arrays.sort(arr);
		String first = arr[0];
		String last = arr[arr.length - 1];
		int i=0;
		while(i<first.length()&& i<last.length()&& first.charAt(i)==last.charAt(i)) {
			i++;
		}
		return first.substring(0,i);
	}

	public static void main(String[] args) {
		String arr[] = { "armstrong", "armor", "archer" };
		System.out.println("Common Prefix: "+findPrefix(arr));

	}

}
