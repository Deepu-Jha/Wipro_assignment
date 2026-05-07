package assignment_day_7;
import java.util.*;
public class Intersection {

    public static void main(String[] args) {

        HashSet<Integer> firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);

        HashSet<Integer> secondSet = new HashSet<>();
        secondSet.add(2);
        secondSet.add(3);
        secondSet.add(4);

        HashSet<Integer> commonNumbers = new HashSet<>(firstSet);

        commonNumbers.retainAll(secondSet);

        System.out.println("Common Elements: " + commonNumbers);
    }
}
