package assignment_day_8;
import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();

        cart.add("Monitor");
        cart.add("CPU");
        cart.add("Keyboard");

        Map<String, Integer> priceMap = new HashMap<>();

        priceMap.put("Monitor", 10000);
        priceMap.put("CPU", 30000);
        priceMap.put("Keyboard", 1000);

        int total = 0;

        System.out.println("Cart Items:");

        for (String item : cart) {

            System.out.println(item + " = " + priceMap.get(item));

            total = total + priceMap.get(item);
        }

        System.out.println("Total Price: " + total);
    }
}