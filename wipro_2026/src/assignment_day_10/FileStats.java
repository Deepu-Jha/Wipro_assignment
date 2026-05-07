package assignment_day_10;
import java.io.*;
public class FileStats {
    public static void main(String[] args) {
        int lines = 0;
        int words = 0;
        int characters = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                characters += line.length() + 1; 
                if (!line.trim().isEmpty()) {
                    String[] wordList = line.trim().split("\\s+");
                    words += wordList.length;
                }
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check file path.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}