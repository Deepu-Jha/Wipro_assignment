package assignment_day_2;

public class user_role_check {

	public static void main(String[] args) {
        String role = "Admin";

        switch (role) {
            case "Admin":
                System.out.println("Full Access");
                break;
            case "User":
                System.out.println("Limited Access");
                break;
            case "Guest":
                System.out.println("View Only");
                break;
            default:
                System.out.println("No Access");
        }// TODO Auto-generated method stub

	}

}
