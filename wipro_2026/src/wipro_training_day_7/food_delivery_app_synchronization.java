package wipro_training_day_7;

class FoodDelivery1{

    FoodDelivery1() {

    }

    synchronized void processFood(String task) {

        try {

            System.out.println(task + " Started");

            Thread.sleep(2000);

            System.out.println(task + " Completed");

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}

class OrderThread extends Thread {

    FoodDelivery1 f;

    OrderThread(FoodDelivery1 f) {

        this.f = f;
    }

    public void run() {

        f.processFood("Order Processing");
    }
}

class PaymentThread extends Thread {

    FoodDelivery1 f;

    PaymentThread(FoodDelivery1 f) {

        this.f = f;
    }

    public void run() {

        f.processFood("Payment Processing");
    }
}

class NotificationThread extends Thread {

    FoodDelivery1 f;

    NotificationThread(FoodDelivery1 f) {

        this.f = f;
    }

    public void run() {

        f.processFood("Notification");
    }
}

public class food_delivery_app_synchronization {

    public static void main(String[] args) {

        FoodDelivery1 obj = new FoodDelivery1();

        OrderThread t1 = new OrderThread(obj);

        PaymentThread t2 = new PaymentThread(obj);

        NotificationThread t3 = new NotificationThread(obj);

        t1.start();

        t2.start();

        t3.start();
    }
}