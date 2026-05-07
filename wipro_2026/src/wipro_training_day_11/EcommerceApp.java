package wipro_training_day_11;
import java.io.*;   
public class EcommerceApp {
    public static void main(String[] args) {
        try {
            FileWriter fw =
                    new FileWriter("orders.txt");
            fw.write("Order ID:101\n");
            fw.write("Product:Laptop\n");
            fw.write("Customer:Deepu\n");
            fw.close();
            System.out.println("Order Saved\n");
            BufferedReader br =
                    new BufferedReader(
                            new FileReader("orders.txt"));
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