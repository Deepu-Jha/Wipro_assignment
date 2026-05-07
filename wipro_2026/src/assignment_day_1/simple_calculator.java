package assignment_day_1;

public class simple_calculator {

	public static void main(String[] args) {
        int n1 = 17, n2 = 8;
        char op = '-';

        switch (op) {
            case '+':
                System.out.println("Result: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Result: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Result: " + (n1 * n2));
                break;
            case '/':
                System.out.println("Result: " + (n1 / n2));
                break;
            default:
                System.out.println("Invalid operator");
        }// TODO Auto-generated method stub

	}

}
