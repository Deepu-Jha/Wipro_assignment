package wipro_training_day_5;
import java.util.Scanner;

class Payment1 {

 final void processPayment1(double amount) {
     System.out.println("Processing secure payment of " + amount);
 }
}

class UPI extends Payment1 {
       
	//System.out.println("Modified " + amount);
}

public class payment_system {
 public static void main(String[] args) {


     Scanner sc = new Scanner(System.in);

     System.out.println("Enter amount:");
     double amount = sc.nextDouble();

     UPI obj = new UPI();

     obj.processPayment1(amount);
 }
}