package owu.javahomework3.com;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Magazine extends Book {
    private String magazineName;
}
