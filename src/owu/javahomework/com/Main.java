package owu.javahomework.com;

import owu.javahomework.com.interfaces.Printable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> arr = new ArrayList<>();

        Book book = new Book("Harry Potter");

        Magazine magazine = new Magazine("Book store of Montenegro");

        arr.add(book);
        arr.add(magazine);

        arr.forEach(Printable::print);
    }
}
