package owu.javahomework2.com;

import owu.javahomework2.com.interfaces.Instrument;
import owu.javahomework2.com.models.Drum;
import owu.javahomework2.com.models.Guitar;
import owu.javahomework2.com.models.Trumpet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();

        Guitar guitar = new Guitar(7);

        Drum drum = new Drum(50);

        Trumpet trumpet = new Trumpet(60);

        instruments.add(guitar);
        instruments.add(drum);
        instruments.add(trumpet);

        instruments.forEach(Instrument::play);
    }
}
