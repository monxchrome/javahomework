package owu.javahomework4.com;

import lombok.Builder;

@Builder
public class Skill {
    private int exp;

    private LanguagesEnum title;

    public String toString() {
        return "Title: "
                + title + "\nExp: "
                + exp;
    }
}
