package wipro_training_day_2;

public class user_login_validation_system {

	public static void main(String[] args) {
		String username = "Wipro";
		String password = "12345";
		String inputuser = "Wipro";
		String inputpass = "12345";// TODO Auto-generated method stub
		if(username == inputuser && password == inputpass) {
			System.out.println("Login Sucessful");
		}
		else{
			System.out.println("Login Failed");
		}
		
	}

}
