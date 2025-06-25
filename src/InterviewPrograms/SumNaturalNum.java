package InterviewPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class SumNaturalNum {

	@Test
	public void sum() {
		int sum=0;
		for(int i=1; i<=10;i++) {
			sum+=i;
		}
		System.out.println("sum: "+sum);
	}
	
	@Test
	public void names() {
		String[] names= {"amol","aldar","sneha","aldar"};
		
		Set<String> set= new HashSet<String>();
		for(String name:names) {
			set.add(name);
		}
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			String userName=itr.next();
			
			System.out.println(itr.next());
		}
	}
	
	
	@Test
	public void Pyramid() {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	@Test
	public void fibbonacci() {
		int n1=0, n2=1, n3, total=10;
		System.out.print(n1+" "+n2);  //printing 0 and 1      
		for(int i=2;i<=total;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
