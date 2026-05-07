package assignment_day_2;

public class atm_menu {

	public static void main(String[] args) {
        int choice = 2;
        double balance = 2000;

        switch (choice) {
            case 1:
                System.out.println("Balance: " + balance);
                break;
            case 2:
                balance += 500;
                System.out.println("Deposited. New Balance: " + balance);
                break;
            case 3:
                balance -= 200;
                System.out.println("Withdrawn. New Balance: " + balance);
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice");
        }// TODO Auto-generated method stub

	}

}
