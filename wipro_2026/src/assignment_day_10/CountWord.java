package assignment_day_10;
import java.io.*;

public class CountWord {
    public static void main(String[] args) {
        String targetWord = "Java";
        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            br.close();

            System.out.println("Occurrences of \"" + targetWord + "\": " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}