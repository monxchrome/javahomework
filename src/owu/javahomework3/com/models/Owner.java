package owu.javahomework3.com.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Owner {

    final String name;

    final int yearsOld;

    private int yearsOfDriving;
}
