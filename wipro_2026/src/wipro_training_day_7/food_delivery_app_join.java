package wipro_training_day_7;
class OrderProcessing1 implements Runnable {
    public void run() {
        try {
            System.out.println("Order Processing Started");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
class PaymentProcessing1 implements Runnable {
    public void run() {
        try {
            System.out.println("Payment Processing Started");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
class Notification1 implements Runnable {
    public void run() {
        try {
            System.out.println("Notification ");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

public class food_delivery_app_join {

    public static void main(String[] args) {

        try {

            OrderProcessing1 obj1 = new OrderProcessing1();

            PaymentProcessing1 obj2 = new PaymentProcessing1();

            Notification1 obj3 = new Notification1();

            Thread t1 = new Thread(obj1);

            Thread t2 = new Thread(obj2);

            Thread t3 = new Thread(obj3);

            t1.start();

            t1.join();

            t2.start();

            t2.join();

            t3.start();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}
