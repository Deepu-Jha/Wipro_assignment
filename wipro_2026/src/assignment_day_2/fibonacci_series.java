package assignment_day_2;

public class fibonacci_series {

	public static void main(String[] args) {
        int n = 15, a = 0, b = 1, i = 1;

        while (i <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            i++;
        }// TODO Auto-generated method stub

	}

}
