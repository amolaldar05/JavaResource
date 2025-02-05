package InterviewPrograms;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        // Add elements to the TreeMap
        treeMap.put(1, "Apple");
        treeMap.put(3, "Banana");
        treeMap.put(2, "Cherry");
        treeMap.put(5, "Date");
        // Print all elements of the TreeMap
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
