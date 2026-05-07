package wipro_training_day_11;
import java.io.*;
public class BankingApp {
    public static void main(String[] args) {
        try {

            FileWriter fw =
                    new FileWriter("transaction.txt", true);
            fw.write("Deepu deposited Rs.5000\n");
            fw.write("Deepu withdrew Rs.2000\n");
            fw.close();
            BufferedReader br =
                    new BufferedReader(
                            new FileReader("transaction.txt"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
