package owu.javahomework2.com.models;

import lombok.Data;
import owu.javahomework2.com.interfaces.Instrument;

@Data
public class Trumpet implements Instrument {
    private final int diameter;

    @Override
    public void play() {
        System.out.println("The trumpet is playing with these diameter " + diameter);
    }
}
