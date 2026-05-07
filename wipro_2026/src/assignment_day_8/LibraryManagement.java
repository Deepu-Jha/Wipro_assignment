package assignment_day_8;
import java.util.*;

class Book {
    String name;
    Book(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
public class LibraryManagement {
    public static void main(String[] args) {

        Map<Book, Boolean> library = new HashMap<>();

        Book b1 = new Book("Java");
        Book b2 = new Book("Python");
        Book b3 = new Book("C++");

        library.put(b1, true);
        library.put(b2, false);
        library.put(b3, true);

        for (Map.Entry<Book, Boolean> entry : library.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}