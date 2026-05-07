package assignment_day;
import java.util.concurrent.*;
class Order implements Runnable {
    int orderId;
    Order(int orderId) {
        this.orderId = orderId;
    }
    public void run() {
        System.out.println(
                "Processing Order " + orderId
        );
        try {
            Thread.sleep(2000);
        }
        catch(Exception e){}

        System.out.println(
                "Delivered Order " + orderId
        );
    }
}
public class FoodDeliveryApp {
    public static void main(String[] args) {
        ExecutorService service =
                Executors.newFixedThreadPool(3);
        for(int i=1;i<=10;i++) {
            service.execute(new Order(i));
        }
        service.shutdown();
    }
}
