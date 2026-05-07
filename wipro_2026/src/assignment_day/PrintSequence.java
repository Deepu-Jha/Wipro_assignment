package assignment_day;
class PrintABC {
    int turn = 1;
    synchronized void printA() {
        for(int i=0;i<5;i++) {
            while(turn != 1) {
                try {
                    wait();
                }
                catch(Exception e){}
            }

            System.out.print("A");
            turn = 2;
            notifyAll();
        }
    }
    synchronized void printB() {
        for(int i=0;i<5;i++) {
            while(turn != 2) {
                try {
                    wait();
                }
                catch(Exception e){}
            }

            System.out.print("B");
            turn = 3;
            notifyAll();
        }
    }
    synchronized void printC() {
        for(int i=0;i<5;i++) {
            while(turn != 3) {
                try {
                    wait();
                }
                catch(Exception e){}
            }

            System.out.print("C");
            turn = 1;
            notifyAll();
        }
    }
}

public class PrintSequence {

    public static void main(String[] args) {

        PrintABC obj = new PrintABC();

        new Thread(() -> obj.printA()).start();

        new Thread(() -> obj.printB()).start();

        new Thread(() -> obj.printC()).start();
    }
}