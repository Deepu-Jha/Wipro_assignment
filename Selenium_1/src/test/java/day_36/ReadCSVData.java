package day_36;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadCSVData {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new FileReader("C:\\Users\\naren\\OneDrive\\Documents\\data.csv"));

        String line;

        // Skip header row
        br.readLine();

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            System.out.println("Username: " + data[0]);
            System.out.println("Password: " + data[1]);
            System.out.println("----------------");
        }

        br.close();
    }
}