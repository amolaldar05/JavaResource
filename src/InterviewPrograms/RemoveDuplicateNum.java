package InterviewPrograms;

import java.io.IOException;
import java.util.TreeSet;

public class RemoveDuplicateNum {

	public static void main(String[] args) throws IOException {

		int[] a = { 55, 39, 26, 78, 55, 99, 30 };

		TreeSet<Integer> t = new TreeSet<>();

		for (int i = 0; i < a.length; i++) {

			t.add(a[i]);

		}

		System.out.println(t);

	}

}
