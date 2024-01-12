package owu.javahomework2.com.models;

import lombok.Data;
import owu.javahomework2.com.interfaces.Instrument;

@Data
public class Drum implements Instrument {
    private final int size;

    @Override
    public void play() {
        System.out.println("The drum is playing with these size: " + size);
    }
}
