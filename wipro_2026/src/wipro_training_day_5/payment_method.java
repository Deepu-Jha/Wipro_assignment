package wipro_training_day_5;
import java.util.Scanner;

interface Payment {

    void pay(double amount);
    default void checkStatus() {
        System.out.println("Transaction is successful");
    }
}
class GooglePay implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Google Pay");
    }
}
class PhonePe implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PhonePe");
    }
}

public class payment_method {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Payment Method:");
        System.out.println("1. Google Pay");
        System.out.println("2. PhonePe");

        int choice = sc.nextInt();

        System.out.println("Enter amount:");
        double amount = sc.nextDouble();

        Payment p;

        if (choice == 1) {
            p = new GooglePay();
        } else {
            p = new PhonePe();
        }

        p.pay(amount);
        p.checkStatus();   
    
	}

}
