package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class InnerOuterHashMap {
//'A' : 5, 'G' : {'E' : 10, 'B' : 20}, 'F' : 100, 'S' : 90
	public static void main(String[] args) {
		Map<Character, Integer> innerMap= new HashMap<>();
		innerMap.put('E', 10);
		innerMap.put('B', 20);
		Map<Character, Object> outerMap= new HashMap<>();
		outerMap.put('A', 5);
		outerMap.put('G', innerMap);
		outerMap.put('F', 100);
		outerMap.put('S', 90);
		System.out.print(outerMap);
		
		Object value = outerMap.get('G');
		if (value instanceof Map) {
			Map<Character, Integer> nestedMap = (Map<Character, Integer>) value;
			int val = nestedMap.get('E');
			System.out.print("======" + val);
		} else {
			System.out.print("======Value for 'G' is not a Map");
		}
	}

}
