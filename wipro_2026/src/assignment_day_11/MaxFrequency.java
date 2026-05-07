package assignment_day_11;
import java.util.*;
public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 2, 1, 3, 4, 5, 4, 5, 4, 2, 4};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxKey = 0, maxCount = 0;

        for (int key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                maxKey = key;
            }
        }

        System.out.println("Element with max frequency: " + maxKey);
    }
}