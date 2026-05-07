package wipro_training_day_2;

public class atm_withdrawal_system {

	public static void main(String[] args) {
		double balance = 10000;
		double withdrawal_amount=6000;
		if(withdrawal_amount<=balance){
		balance = balance - withdrawal_amount;
		System.out.println("Withdrawal Suceessful");
		System.out.println("Remaining_balance : " + balance);// TODO Auto-generated method stub
		}
		else {
			System.out.println("Insufficient Balance");
		}

	}

}
