package assignment_day_2;

public class currency_converter {

	public static void main(String[] args) {
        int choice = 1;
        double inr = 1000;

        switch (choice) {
            case 1:
                System.out.println("USD: " + (inr / 90));
                break;
            case 2:
                System.out.println("EUR: " + (inr / 96));
                break;
            default:
                System.out.println("Invalid choice");
        }// TODO Auto-generated method stub

	}

}
