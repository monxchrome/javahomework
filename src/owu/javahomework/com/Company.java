package owu.javahomework.com;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Company {
    private String name;

    private String catchPhrase;

    private String bs;

    public String toString() {
        return "Name: "
                + name + "\nCatch Phrase: "
                + catchPhrase + "\nBS: "
                + bs;
    }
}
