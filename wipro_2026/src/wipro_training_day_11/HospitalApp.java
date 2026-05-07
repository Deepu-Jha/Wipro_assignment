package wipro_training_day_11;
import java.io.*;
public class HospitalApp {
    public static void main(String[] args) {
        try {
            FileWriter fw =
                    new FileWriter("patient.txt");
            fw.write("Patient Name: Raju\n");
            fw.write("Disease: Fever\n");
            fw.write("Doctor: Mishra\n");
            fw.close();
            System.out.println("Patient Record Saved");
            BufferedReader br =
                    new BufferedReader(
                            new FileReader("patient.txt"));
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