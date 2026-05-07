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
public class EmployeeRead {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream("employee.txt"));
            Employee emp =
                    (Employee) ois.readObject();
            System.out.println("Employee ID: " + emp.id);
            System.out.println("Employee Name: " + emp.name);
            ois.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}