package owu.javahomework.com;

import lombok.*;

@Data
@Builder
public class User {
    private int id;

    private String name;

    private String email;

    private Address address;

    private String phone;

    private String website;

    private Company company;

    @Override
    public String toString() {
        return "Id: "
                + id + "\nName: "
                + email + "\nEmail: "
                + name + "\nAddress: "
                + address + "\nPhone: "
                + phone + "\nWebsite: "
                + website + "\nCompany"
                + company + "\n";
    }
}
