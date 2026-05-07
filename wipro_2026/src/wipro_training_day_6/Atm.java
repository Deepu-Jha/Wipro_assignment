package wipro_training_day_6;
import java.util.Scanner;

class InvalidPinException extends Exception {

    public InvalidPinException(String message) {
        super(message);
    }
}

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPin = 982145;
        int attempts = 3;
        while (attempts > 0) {
            try {
                System.out.println("Card Inserted");
                System.out.print("Enter PIN: ");
                int enteredPin = sc.nextInt();
                if (enteredPin != correctPin) {
                    attempts--;
                    throw new InvalidPinException(
                        "Incorrect PIN. Attempts left: " + attempts
                    );
                }
                System.out.println("Access Granted");
                System.out.println("Transaction Successful");
                break;
            } catch (InvalidPinException e) {
                System.out.println("Exception: " + e.getMessage());
                if (attempts == 0) {
                    System.out.println("Card Blocked");
                }

            } finally {
                System.out.println("Transaction Logged");
            }
        }

        sc.close();
    }
}