package assignment_day_2;

public class count_digit {

	public static void main(String[] args) {
        int num = 9245789, count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Digits: " + count);
    }// TODO Auto-generated method stub

}
