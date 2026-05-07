package assignment_day_2;

public class armstrong_number {

	public static void main(String[] args) {
        int num = 153, temp = num, sum = 0;

        while (num != 0) {
            int d = num % 10;
            sum += d * d * d;
            num /= 10;
        }

        if (sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");// TODO Auto-generated method stub

	}

}
