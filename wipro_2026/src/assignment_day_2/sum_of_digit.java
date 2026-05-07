package assignment_day_2;

public class sum_of_digit {

	public static void main(String[] args) {
        int num = 123456789, sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum: " + sum);
    }// TODO Auto-generated method stub

}
