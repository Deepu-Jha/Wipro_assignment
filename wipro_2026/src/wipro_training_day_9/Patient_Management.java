package wipro_training_day_9;
import java.util.ArrayList;
import java.util.Scanner;

class Patient1 {
    String name;
    int age;

    Patient1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Patient_Management {

    static ArrayList<Patient1> patients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addPatient1() {
        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        patients.add(new Patient1(name, age));
        System.out.println("Patient added successfully.");
    }

    public static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }

        System.out.println("\n--- OPD Patient List ---");
        for (Patient1 p : patients) {
            System.out.println("Name: " + p.name + ", Age: " + p.age);
        }
    }


    public static void searchPatient() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        for (Patient1 p : patients) {
            if (p.name.equalsIgnoreCase(name)) {
                System.out.println("Patient found: " + p.name + ", Age: " + p.age);
                return;
            }
        }

        System.out.println("Patient not found.");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== OPD Patient Management =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addPatient1();
                    break;

                case 2:
                    viewPatients();
                    break;

                case 3:
                    searchPatient();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}
