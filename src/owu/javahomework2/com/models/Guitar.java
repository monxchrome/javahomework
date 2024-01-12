package owu.javahomework2.com.models;

import lombok.Data;
import owu.javahomework2.com.interfaces.Instrument;

@Data
public class Guitar implements Instrument {
    private final int numberOfStrings;

    @Override
    public void play() {
        System.out.println("THe guitar is playing with these number of strings " + numberOfStrings);
    }
}
