package wipro_training_day_4;

import java.util.*;


class Patient {
    private int id;
    private String name;
    private int age;
    private String illness;

    public Patient(int id, String name, int age, String illness) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getIllness() { return illness; }
}


interface PatientService {
    void registerPatient(Patient patient);
    void showPatients();
}


class PatientServiceImpl implements PatientService {

    private Patient[] patients = new Patient[10]; 
    private int count = 0;

    public void registerPatient(Patient patient) {
        if (count < patients.length) {
            patients[count] = patient;
            count++;
            System.out.println("Patient Registered: " + patient.getName());
        } else {
            System.out.println("Storage Full!");
        }
    }

    public void showPatients() {
        System.out.println("\n--- Patient List ---");

        for (int i = 0; i < count; i++) {
            Patient p = patients[i];
            System.out.println(
                p.getId() + " | " +
                p.getName() + " | Age: " +
                p.getAge() + " | Illness: " +
                p.getIllness()
            );
        }
    }
}


abstract class Doctor {
    protected String name;
    protected String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    abstract void diagnose(Patient patient);
}


class GeneralPhysician extends Doctor {
    public GeneralPhysician(String name) {
        super(name, "General");
    }

    void diagnose(Patient patient) {
        System.out.println("Dr. " + name +
            " treats " + patient.getName() +
            " for " + patient.getIllness());
    }
}

class Cardiologist extends Doctor {
    public Cardiologist(String name) {
        super(name, "Cardiology");
    }

    void diagnose(Patient patient) {
        if (patient.getIllness().toLowerCase().contains("heart")) {
            System.out.println("Dr. " + name +
                " treating heart issue of " + patient.getName());
        } else {
            System.out.println("Dr. " + name +
                " suggests general checkup for " + patient.getName());
        }
    }
}


public class healthcare {
    public static void main(String[] args) {

        PatientService service = new PatientServiceImpl();

        Patient p1 = new Patient(1, "Narendra", 23, "Fever");
        Patient p2 = new Patient(2, "Aayush", 24, "Heart Pain");

        service.registerPatient(p1);
        service.registerPatient(p2);

        service.showPatients();

        Doctor doc1 = new GeneralPhysician("Jha");
        Doctor doc2 = new Cardiologist("Mishra");

        System.out.println("\n--- Diagnosis ---");

        doc1.diagnose(p1);
        doc1.diagnose(p2);

        doc2.diagnose(p1);
        doc2.diagnose(p2);
    }
}