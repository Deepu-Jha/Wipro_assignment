package wipro_training_day_11;
import java.io.*;

class Student implements Serializable {
    int id;
    String name;
}

public class Deserialzable {
    public static void main(String[] args) {

        try {

            ObjectInputStream ois =
                new ObjectInputStream(
                    new FileInputStream("student.txt"));

            Student s = (Student) ois.readObject();

            System.out.println(s.id + " " + s.name);

            ois.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}