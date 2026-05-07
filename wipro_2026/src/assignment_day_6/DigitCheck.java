package assignment_day_6;
public class DigitCheck {

    public static void main(String[] args) {

        char ch = '9';

        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is not a digit");
        }
    }
}