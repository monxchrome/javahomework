package owu.javahomework4.com;

import java.util.ArrayList;

public class BuilderDemo {
    public static void main(String[] args) {
        Skill skill = Skill.builder()
                .title(LanguagesEnum.JS)
                .exp(10)
                .build();
        Skill javaSkill = Skill.builder()
                .title(LanguagesEnum.JAVA)
                .exp(1)
                .build();
        Skill pythonSkill = Skill.builder()
                .title(LanguagesEnum.PYTHON)
                .exp(7)
                .build();
        User user = User.builder()
                .id(1)
                .name("Stefan")
                .surname("Samokhval")
                .email("admin@admin.com")
                .age(18)
                .gender(GenderEnum.MALE)
                .skills(new ArrayList<>())
                .car(
                        Car.builder()
                                .model("Toyota Supra")
                                .year(1997)
                                .power(2500)
                                .build()
                )
                .build();

        user.getSkills().add(skill);
        user.getSkills().add(javaSkill);
        user.getSkills().add(pythonSkill);
        System.out.println(user);
    }
}
