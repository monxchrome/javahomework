package owu.javahomework.com;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String street;

    private String suite;

    private String city;

    private String zipcode;

    private Geo geo;

    @Override
    public String toString() {
        return "Street: "
                + street + "\nSuite: "
                + suite + "\nCity"
                + city + "\nZip-Code: "
                + zipcode + "\nGeo: "
                + geo;
    }
}
