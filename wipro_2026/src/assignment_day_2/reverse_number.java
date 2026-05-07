package assignment_day_2;

public class reverse_number {

	public static void main(String[] args) {
        int num = 9768, rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse: " + rev);
    }// TODO Auto-generated method stub

}
