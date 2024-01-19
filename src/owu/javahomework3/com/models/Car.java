package owu.javahomework3.com.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

    final String brand;

    private int engine_power;

    final Owner owner;

    final int price;

    final int year;
}
