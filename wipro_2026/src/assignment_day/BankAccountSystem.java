package assignment_day;
class BankAccount {
    int balance = 2000;
    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }
    synchronized void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
            System.out.println("Balance: " + balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        Thread t1 =
                new Thread(() -> acc.deposit(500));
        Thread t2 =
                new Thread(() -> acc.withdraw(700));

        t1.start();
        t2.start();
    }
}