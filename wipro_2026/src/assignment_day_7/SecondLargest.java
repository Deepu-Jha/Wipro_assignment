package assignment_day_7;
import java.util.*;

public class SecondLargest {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 45, 67, 23, 89);

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int value : numbers) {

            if (value > max) {

                secondMax = max;
                max = value;

            } else if (value > secondMax && value != max) {

                secondMax = value;
            }
        }

        System.out.println("Second Largest Number: " + secondMax);
    }
}