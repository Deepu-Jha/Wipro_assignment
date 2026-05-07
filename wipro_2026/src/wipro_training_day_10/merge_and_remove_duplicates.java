package wipro_training_day_10;
import java.util.*;

public class merge_and_remove_duplicates {
    public static void main(String[] args) {

        int num1 = 1234;
        int num2 = 3456;

        ArrayList<Integer> list = new ArrayList<>();

        while (num1 > 0) {
            int digit = num1 % 10;

            if (!list.contains(digit)) {
                list.add(digit);
            }

            num1 = num1 / 10;
        }

        while (num2 > 0) {
            int digit = num2 % 10;

            if (!list.contains(digit)) {
                list.add(digit);
            }

            num2 = num2 / 10;
        }

        System.out.println("Merged without duplicates: " + list);
    }
}