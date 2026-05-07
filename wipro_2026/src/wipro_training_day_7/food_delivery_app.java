package wipro_training_day_7;
import java.util.*;
class OrderProcessing implements Runnable {

    public void run() {
        try {
            System.out.println("Order Processing Started");
            Thread.sleep(2000);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
class PaymentProcessing implements Runnable {
    public void run(){
        try {
        	Thread.sleep(800);
            System.out.println("Payment Processing Started");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
class Notification implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Notification Sent to User");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

public class food_delivery_app {
    public static void main(String[] args) {
        OrderProcessing obj1 = new OrderProcessing();
        PaymentProcessing obj2 = new PaymentProcessing();
        Notification obj3 = new Notification();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        t1.start();
        t2.start();
        t3.start();
    }
}