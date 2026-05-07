package assignment_day_6;

public class method_accepts  {

    static void changeValue(int x) {
        System.out.println("Inside method before change: " + x);

        x = 50;

        System.out.println("Inside method after change: " + x);
    }

    public static void main(String[] args) {

        int num = 10;

        System.out.println("Before method call: " + num);

        changeValue(num);

        System.out.println("After method call: " + num);
    }
}