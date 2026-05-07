package wipro_training_day_9;
import java.util.LinkedList;


class Patient {
    String name;


    Patient(String name) {
        this.name = name;
    }
}

public class Hospital {

    LinkedList<Patient> list = new LinkedList<>();

    public void addPatient(String name) {
        list.addLast(new Patient(name)); // add at last
        System.out.println(name + " added to queue.");
    }

    public void addEmergencyPatient(String name) {
        list.addFirst(new Patient(name)); 
        System.out.println(name + " added as EMERGENCY.");
    }

    public void removePatient() {
        if (list.isEmpty()) {
            System.out.println("No patients in queue.");
        } else {
            Patient p = list.removeFirst(); 
            System.out.println(p.name + " has been treated and removed.");
        }
    }

    public void viewPatients() {
        if (list.isEmpty()) {
            System.out.println("No patients in queue.");
            return;
        }

        System.out.println("Patient List:");
        
        for (Patient p : list) {
            System.out.println(p.name);
        }
    }

    public void searchPatient(String name) {
        for (Patient p : list) {
            if (p.name.equalsIgnoreCase(name)) {
                System.out.println(name + " is in the queue.");
                return;
            }
        }
        System.out.println(name + " not found.");
    }
  
    public void checkFirstAndLast() {
        if (list.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("First patient: " + list.getFirst().name);
            System.out.println("Last patient: " + list.getLast().name);
        }
    }

        public static void main(String[] args) {

        Hospital hq = new Hospital();

        hq.addPatient("Aayush");
        hq.addPatient("Aarav");
        hq.addEmergencyPatient("Arif");

        hq.viewPatients();

        hq.checkFirstAndLast();

        hq.searchPatient("Aarav");

        hq.removePatient();
        hq.viewPatients();
    }
}