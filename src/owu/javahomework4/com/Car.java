package owu.javahomework4.com;

import lombok.Builder;

@Builder
public class Car {
    private String model;

    private int year;

    private int power;

    public String toString() {
        return "Model: "
                + model + "\nYear: "
                + year + "\nPower: "
                + power;
    }
}
