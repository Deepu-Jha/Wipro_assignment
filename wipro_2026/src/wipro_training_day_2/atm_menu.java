package wipro_training_day_2;

public class atm_menu {

	public static void main(String[] args) {

		        int choices[] = {1, 2, 3, 1, 4}; // predefined operations
		        double balance = 2200;

		        for (int i = 0; i < choices.length; i++) {

		            int choice = choices[i];

		            switch (choice) {
		                case 1:
		                    System.out.println("Balance: " + balance);
		                    break;

		                case 2:
		                    double deposit = 500;
		                    balance += deposit;
		                    System.out.println("Deposited: " + deposit);
		                    break;

		                case 3:
		                    double withdraw = 300;
		                    if (withdraw <= balance) {
		                        balance -= withdraw;
		                        System.out.println("Withdrawn: " + withdraw);
		                    } else {
		                        System.out.println("Insufficient balance!");
		                    }
		                    break;

		                case 4:
		                    System.out.println("Exit");
		                    break;

		                default:
		                    System.out.println("Invalid choice!");
		            }
		        }
		 // TODO Auto-generated method stub

	}

}
