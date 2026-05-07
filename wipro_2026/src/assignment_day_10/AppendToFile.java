package assignment_day_10;
import java.io.*;
import java.util.Scanner;
public class AppendToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to append: ");
        String input = sc.nextLine();

        try {
            FileWriter fw = new FileWriter("input.txt", true); 
            fw.write(input + "\n");
            fw.close();

            System.out.println("Data appended successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}