package com.math.operations;

public class Operations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        Operations obj = new Operations();

        int addition = obj.add(70, 40);
        int subtraction = obj.subtract(70, 40);

        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
    }
}