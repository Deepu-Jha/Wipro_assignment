package assignment_day_2;

public class prime_number {

	public static void main(String[] args) {
        int num = 13, i = 2;
        boolean isPrime = true;

        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }// TODO Auto-generated method stub

}
