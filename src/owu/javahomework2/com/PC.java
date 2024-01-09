package owu.javahomework2.com;

import lombok.Data;

@Data
public class PC {
    protected String cpu;

    protected String gpu;

    protected String ram;

    protected String motherboard;

    protected String power;

    public void printInfo() {
        System.out.println(
                "Name: "
                        + cpu + "\nGPU: "
                        + gpu + "\nRAM: "
                        + ram + "\nMotherboard: "
                        + motherboard + "\nPower: "
                        + power + "\n"
        );
    }
}
