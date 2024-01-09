package owu.javahomework2.com;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PC> pcs = new ArrayList<>();

        PC pc = new PC();
        pc.setCpu("i5 10400f");
        pc.setGpu("RTX 3060TI");
        pc.setMotherboard("Asus B-560M");
        pc.setRam("16GB");

        var laptop = new Laptop();
        laptop.setName("Asus ROG");
        laptop.setType(LaptopEnum.GAMING);

        var ultrabook = new Ultrabook();
        ultrabook.setRgb(UltrabookEnum.YES);

        pcs.add(pc);
        pcs.add(laptop);
        pcs.add(ultrabook);

        for (PC pc1 : pcs) {
            System.out.println(pc1);
        }
    }
}
