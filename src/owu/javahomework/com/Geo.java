package owu.javahomework.com;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Geo {
    private String lat;

    private String lng;

    @Override
    public String toString() {
        return "Lat: "
                + lat + "\nLng: "
                + lng;
    }
}
