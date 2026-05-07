package wipro_training_day_10;
import java.util.*;

class Patient2 {
    int id;
    String name;

    Patient2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class patient_tree {
    public static void main(String[] args) {
    	
        TreeSet<Patient2> patients = new TreeSet<>(
            (p1, p2) -> p1.id - p2.id
        );

        addPatient(patients, new Patient2(101, "Deepu"));
        addPatient(patients, new Patient2(102, "Rahul"));
        addPatient(patients, new Patient2(101, "Amit")); // duplicate

        System.out.println("\nPatients (Sorted):");
        for (Patient2 p : patients) {
            System.out.println(p);
        }
    }

    public static void addPatient(TreeSet<Patient2> patients, Patient2 p) {
        if (!patients.add(p)) {
            System.out.println("❌ Already registered: " + p.id);
        } else {
            System.out.println("✅ Added: " + p.name);
        }
    }
}