package wipro_training_day_11;
import java.io.*;
class Employee implements Serializable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class EmployeeApp {
    public static void main(String[] args) {
        try {

            Employee emp =
                    new Employee(101, "Deepu");

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream("employee.txt"));
            oos.writeObject(emp);
            oos.close();
            System.out.println("Employee Object Saved");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}