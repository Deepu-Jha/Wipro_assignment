package assignment_day_2;

public class palindrome {

	public static void main(String[] args) {
        int num = 121, temp = num, rev = 0;

        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }

        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");// TODO Auto-generated method stub

	}

}
