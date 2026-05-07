package assignment_day_5;

abstract class Bank {

 abstract int getInterestRate();
}

class SBI extends Bank {

 int getInterestRate() {
     return 7;
 }
}

class HDFC extends Bank {

 int getInterestRate() {
     return 8;
 }
}

//Main class
public class Banks {

 public static void main(String[] args) {

     SBI s = new SBI();
     HDFC h = new HDFC();

     System.out.println("SBI Interest Rate = " + s.getInterestRate() + "%");
     System.out.println("HDFC Interest Rate = " + h.getInterestRate() + "%");
 }
}