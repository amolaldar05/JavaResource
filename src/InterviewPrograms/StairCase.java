package InterviewPrograms;

public class StairCase {
	
	public static int countWays(int stairs) {
		if(stairs==0 || stairs==1) {
			return 1;
		}else if(stairs==2) {
			return 2;
		}
		return countWays(stairs-1) + countWays(stairs-2);
	}

	public static void main(String[] args) {
		int stairs=5;
		int ways=countWays(stairs);
		System.out.print(ways);

	}

}
