package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class Test {
//Input=Amol Popat Aldar
	//Optput= lomA tapoP radlA
	public static void main(String[] args) {
		String str = "Amol Popat Aldar";
		StringBuilder sb = new StringBuilder();
		String[] splittedStr = str.split("\\s");
		String rev =" ";
		for (String s : splittedStr) {
			
			StringBuilder temp = new StringBuilder(s);
			temp.reverse();
			rev = temp.toString();
			sb.append(rev + " ");
			
		}
		System.out.println(sb.toString());
	}
}
