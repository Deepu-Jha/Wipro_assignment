package assignment_day_11;
import java.util.*;
public class SortMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Mango");

        // Using TreeMap (auto-sorts by key)
        Map<Integer, String> sortedMap = new TreeMap<>(map);

        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}