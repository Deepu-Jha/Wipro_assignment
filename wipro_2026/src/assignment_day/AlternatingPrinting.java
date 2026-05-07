package assignment_day;
class NumberPrinter {
    int number = 1;
    synchronized void printOdd() {
        while(number <= 100) {
            if(number % 2 == 0) {
                try {
                    wait();
                }
                catch(Exception e) {
                }
            }
            else {
                System.out.println("Odd: " + number);
                number++;
                notify();
            }
        }
    }
    synchronized void printEven() {
        while(number <= 100) {
            if(number % 2 != 0) {
                try {
                    wait();
                }
                catch(Exception e) {
                }
            }
            else {
                System.out.println("Even: " + number);
                number++;
                notify();
            }
        }
    }
}
public class AlternatingPrinting {
    public static void main(String[] args) {
        NumberPrinter obj = new NumberPrinter();
        Thread t1 = new Thread(() -> obj.printOdd());
        Thread t2 = new Thread(() -> obj.printEven());
        t1.start();
        t2.start();
    }
}