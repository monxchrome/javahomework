package owu.javahomework4.com;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Builder
@Data
public class User {
    private int id;

    private String name;

    private String surname;

    private String email;

    private int age;

    private GenderEnum gender;

    private ArrayList<Skill> skills;

    private Car car;

    @Override
    public String toString() {
        return "Id: "
                + id + "\nName: "
                + name + "\nEmail: "
                + email + "\nSurname: "
                + surname + "\nAge: "
                + age + "\nGender: "
                + gender + "\nSkills"
                + skills + "\nCar"
                + car + "\n";
    }
}
