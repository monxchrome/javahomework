package owu.javahomework2.com;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Ultrabook extends Laptop {
    private UltrabookEnum rgb;

    public void printInfo() {
        System.out.println(
                "Name: "
                + name + "\nCPU: "
                + cpu + "\nGPU: "
                + gpu + "\nRAM: "
                + ram + "\nMotherboard: "
                + motherboard + "\nPower: "
                + power + "\nType: "
                + type + "\nRGB: "
                + rgb + "\n"
                );
    }
}
