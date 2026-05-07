package assignment_day_1;

public class smallest_three_number {

	public static void main(String[] args) {
        int Val1 = 13, Val2 = 6, Val3 = 5;

        if (Val1 <= Val2 && Val1 <= Val3) {
            System.out.println("Smallest: " + Val1);
        } else if (Val2 <= Val1 && Val2 <= Val3) {
            System.out.println("Smallest: " + Val2);
        } else {
            System.out.println("Smallest: " + Val3);// TODO Auto-generated method stub
        }
	}

}
