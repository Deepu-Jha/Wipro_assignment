package wipro_training_day_5;

import java.util.Scanner;

class BankAccount {

    final int accountNumber;

    BankAccount(int accNo) {
        accountNumber = accNo;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
    }
}

public class account_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();

        BankAccount obj = new BankAccount(accNo);
        obj.display();
    }
}