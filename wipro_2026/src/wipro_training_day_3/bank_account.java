package wipro_training_day_3;

public class bank_account {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
	public static void main(String[] args) {
        bank_account acc = new bank_account();
        acc.deposit(1300);
        acc.withdraw(700);
        System.out.println("Balance: " + acc.getBalance());// TODO Auto-generated method stub

	}

}
