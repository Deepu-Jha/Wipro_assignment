package wipro_training_day_11;
import java.io.*;   
public class DeliveryApp {
    public static void main(String[] args) {
        try {
            FileWriter fw =
                    new FileWriter("delivery.txt", true);
            fw.write("Pizza Delivered to Deepu\n");
            fw.close();
            System.out.println("Delivery Log Saved\n");
            FileReader fr =
                    new FileReader("delivery.txt");
            BufferedReader br =
                    new BufferedReader(fr);
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