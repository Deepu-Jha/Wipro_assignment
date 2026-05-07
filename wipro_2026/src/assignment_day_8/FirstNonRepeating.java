package assignment_day_8;
import java.util.*;

public class FirstNonRepeating {

    public static void main(String[] args) {

        String text = "aabbccdee";

        HashMap<Character, Integer> countMap = new HashMap<>();

        for (char ch : text.toCharArray()) {

            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : text.toCharArray()) {

            if (countMap.get(ch) == 1) {

                System.out.println("First Non-Repeating Character: " + ch);

                break;
            }
        }
    }
}
