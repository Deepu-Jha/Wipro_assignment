package wipro_training_day_10;
import java.util.*;
public class HospitalApp {
    static TreeMap<Integer, String> records = new TreeMap<>();
    public static void main(String[] args) {
        addRecord(201, "Deepu");
        addRecord(202, "Rahul");
        updateRecord(201, "Deepak");
        getRecord(201);
        checkRecord(202);
        displayRecords();
        totalRecords();
        deleteRecord(202);
        displayRecords();
        clearRecords();
        totalRecords();
    }

    public static void addRecord(int id, String name) {
        if (records.containsKey(id)) {
            System.out.println("Record already exists: " + id);
        } else {
            records.put(id, name);
            System.out.println("Record added: " + name);
        }
    }

    public static void updateRecord(int id, String newName) {
        if (records.containsKey(id)) {
            records.put(id, newName);
            System.out.println("Record updated: " + id);
        } else {
            System.out.println("Record not found");
        }
    }

    public static void getRecord(int id) {
        if (records.containsKey(id)) {
            System.out.println("Record: ID=" + id + ", Name=" + records.get(id));
        } else {
            System.out.println("Record not found");
        }
    }

    public static void deleteRecord(int id) {
        if (records.containsKey(id)) {
            records.remove(id);
            System.out.println("Record deleted: " + id);
        } else {
            System.out.println("Record not found");
        }
    }

    public static void displayRecords() {
        System.out.println("\nRecords (Sorted):");
        for (Integer key : records.keySet()) {
            System.out.println("ID: " + key + ", Name: " + records.get(key));
        }
    }

    public static void totalRecords() {
        System.out.println("Total Records: " + records.size());
    }

    public static void checkRecord(int id) {
        if (records.containsKey(id)) {
            System.out.println("Record exists: " + id);
        } else {
            System.out.println("Record not found");
        }
    }

    public static void clearRecords() {
        records.clear();
        System.out.println("All records cleared");
    }
}