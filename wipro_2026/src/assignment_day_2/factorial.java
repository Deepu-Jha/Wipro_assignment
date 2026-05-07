package assignment_day_2;

public class factorial {

	public static void main(String[] args) {
        int n = 8, fact = 1, i = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial: " + fact);
    }// TODO Auto-generated method stub

}


