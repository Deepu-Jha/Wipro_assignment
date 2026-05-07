package assignment_day_3;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 5, 1};

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("After removing duplicates: " + set);
    }
}
