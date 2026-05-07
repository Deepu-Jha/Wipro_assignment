package assignment_day_1;

public class largest_three_number {

	public static void main(String[] args) {
        int Val1 = 7, Val2 = 15, Val3 = 18;

        if (Val1 >= Val2 && Val1 >= Val3) {
            System.out.println("Largest: " + Val1);
        } else if (Val2 >= Val1 && Val2 >= Val3) {
            System.out.println("Largest: " + Val2);
        } else {
            System.out.println("Largest: " + Val3);
        }// TODO Auto-generated method stub

	}

}
