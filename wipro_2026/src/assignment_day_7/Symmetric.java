package assignment_day_7;
import java.util.*;

public class Symmetric {

    public static void main(String[] args) {

        HashSet<Integer> groupA = new HashSet<>();
        groupA.add(10);
        groupA.add(20);
        groupA.add(30);

        HashSet<Integer> groupB = new HashSet<>();
        groupB.add(20);
        groupB.add(40);
        groupB.add(50);

        HashSet<Integer> finalResult = new HashSet<>(groupA);

        finalResult.addAll(groupB);

        HashSet<Integer> sameElements = new HashSet<>(groupA);

        sameElements.retainAll(groupB);

        finalResult.removeAll(sameElements);

        System.out.println("Symmetric Difference: " + finalResult);
    }
}