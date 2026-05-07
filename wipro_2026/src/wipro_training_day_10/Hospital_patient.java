package wipro_training_day_10;
import java.util.*;
public class Hospital_patient {
    static HashMap<Integer, String> patients = new HashMap<>();
    public static void main(String[] args) {
        addPatient(101, "Deepu");
        addPatient(102, "Rahul");
        updatePatient(101, "Deepak");
        getPatient(101);
        checkPatient(102);
        listPatients();
        countPatients();
        removePatient(102);
        listPatients();
        clearSystem();
        countPatients();
    }
    public static void addPatient(int id, String name) {
        if (patients.containsKey(id)) {
            System.out.println(" Patient already exists: " + id);
        } else {
            patients.put(id, name);
            System.out.println(" Patient added: " + name);
        }
    }
    public static void updatePatient(int id, String newName) {
        if (patients.containsKey(id)) {
            patients.put(id, newName);
            System.out.println(" Patient updated: " + id);
        } else {
            System.out.println(" Patient not found");
        }
    }
    public static void getPatient(int id) {
        if (patients.containsKey(id)) {
            System.out.println(" Patient: ID=" + id + ", Name=" + patients.get(id));
        } else {
            System.out.println(" Patient not found");
        }
    }

    public static void removePatient(int id) {
        if (patients.containsKey(id)) {
            patients.remove(id);
            System.out.println(" Patient removed: " + id);
        } else {
            System.out.println(" Patient not found");
        }
    }

    public static void listPatients() {
        System.out.println("\n Patient List:");
        for (Integer id : patients.keySet()) {
            System.out.println("ID: " + id + ", Name: " + patients.get(id));
        }
    }

    public static void checkPatient(int id) {
        if (patients.containsKey(id)) {
            System.out.println(" Patient exists: " + id);
        } else {
            System.out.println("Patient not found");
        }
    }

    public static void countPatients() {
        System.out.println(" Total Patients: " + patients.size());
    }
    
    public static void clearSystem() {
        patients.clear();
        System.out.println(" System cleared");
    }
}