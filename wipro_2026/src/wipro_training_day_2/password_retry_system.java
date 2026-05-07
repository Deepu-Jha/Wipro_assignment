package wipro_training_day_2;
import java.util.Scanner;
public class password_retry_system {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String correctpassword = "Wipro";
		String input;
		int attempts = 3;
		while(attempts > 0) {
			System.out.print("Enter password: ");
			input = sc.nextLine();
			
			if(input.equals(correctpassword)) {
				System.out.println("Login Sucessful!");
				break;
			}
			else {
				attempts--;
				System.out.println("Wrong Password");
			}
		}
		if(attempts == 0) {
			System.out.println("Account locked");
		}
		// TODO Auto-generated method stub

	}

}
