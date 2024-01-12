package owu.javahomework.com;

import lombok.Data;
import owu.javahomework.com.interfaces.Printable;

@Data
public class Magazine implements Printable {

    private final String title;

    @Override
    public void print() {
        System.out.println("Magazine name: " + title);;
    }
}
