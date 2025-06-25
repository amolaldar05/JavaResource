package JavaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simple {
	
	public static void preserveSpace(String name) {
		char[] ch=name.toCharArray();
		List<Integer> spaceIndex= new ArrayList<>();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				spaceIndex.add(i);	
			}
			
		}
		
		char result[]= new char[ch.length];
		for(int index:spaceIndex) {
			result[index]=' ';
		}
		
		//reverse
		int j=ch.length-1;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				while(j>=0 && result[j]==' ') {
					j--;
				}
				result[j]=ch[i];
				j--;
			}
		}
		System.out.println(new String(result));
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		preserveSpace(name
				);
		
	

	}

}
