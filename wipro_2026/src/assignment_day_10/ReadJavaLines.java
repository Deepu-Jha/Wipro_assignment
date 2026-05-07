package assignment_day_10;
import java.io.*;

public class ReadJavaLines {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("Java")) {
                    System.out.println(line);
                }
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}