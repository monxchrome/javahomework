package owu.javahomework.com;

import lombok.Data;
import owu.javahomework.com.interfaces.Printable;

@Data
public class Book implements Printable {

    private final String title;

    @Override
    public void print() {
        System.out.println("Book name: " + title);;
    }
}