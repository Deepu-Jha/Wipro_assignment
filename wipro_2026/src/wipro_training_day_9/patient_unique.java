package wipro_training_day_9;

import java.util.HashSet;
import java.util.Objects;

class Patient2 {
    int id;
    String name;

    Patient2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient2)) return false;
        Patient2 p = (Patient2) o;
        return id == p.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class patient_unique {
    public static void main(String[] args) {

        HashSet<Patient2> patients = new HashSet<>();

        addPatient(patients, new Patient2(101, "Deepu"));
        addPatient(patients, new Patient2(102, "Rahul"));
        addPatient(patients, new Patient2(101, "Deepu"));

        System.out.println("\nUnique Registered Patients:");
        for (Patient2 p : patients) {
            System.out.println(p);
        }
    }

    public static void addPatient(HashSet<Patient2> patients, Patient2 p) {
        if (patients.contains(p)) {
            System.out.println("❌ Patient with ID " + p.id + " already registered");
        } else {
            patients.add(p);
            System.out.println("✅ Patient added: " + p.name);
        }
    }
}