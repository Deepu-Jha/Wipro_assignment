package wipro_training_day_7;

class FoodDelivery extends Thread {
    FoodDelivery(String name) {
        setName(name);
    }
    public void run() {
        try {
            System.out.println(getName() + " Started");
            System.out.println(getName() + " isAlive : "
            + isAlive());
            Thread.sleep(2000);
            System.out.println(getName() + " Completed");

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}

public class food_delivery_app_full {

    public static void main(String[] args) {

        try {
            FoodDelivery order =
            new FoodDelivery("Order Processing");

            FoodDelivery payment =
            new FoodDelivery("Payment Processing");

            FoodDelivery notification =
            new FoodDelivery("Notification");

            order.setPriority(8);

            payment.setPriority(5);

            notification.setPriority(3);
            
            order.start();

            order.join();

            payment.start();

            payment.join();

            notification.start();

            notification.join();
            System.out.println("Food Delivery Process Completed");

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}