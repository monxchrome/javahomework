package owu.javahomework2.com;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Laptop extends PC {
    protected String name;

    protected LaptopEnum type;
}
