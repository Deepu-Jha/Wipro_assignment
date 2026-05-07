package assignment_day_5;

interface Calculator {

 void divide(int a, int b);
}

class Demo implements Calculator {

 public void divide(int a, int b) {

     try {

         int result = a / b;

         System.out.println("Result = " + result);

     } catch (ArithmeticException e) {

         System.out.println("Cannot divide by zero");

     }
 }
}

public class exceptio_handling {

 public static void main(String[] args) {

     Demo d = new Demo();

     d.divide(20, 2);

     d.divide(20, 0);
 }
}