package owu.javahomework.com;

public class CarDemo {
    public static void main(String[] args) {
        Object[] objectArray = new Object[5];

        Car car = new Car("BMW M5", 220, 400, false);
        Car car2 = new Car("Mercedes GLE", 240, 450, false);
        Car car3 = new Car("Toyota Supra", 410, 2500, true);
        Car car4 = new Car("Toyota RAV4", 220, 380, false);
        Car car5 = new Car("Mazda RX-8", 330, 1300, true);

        car.setPower(225);

        objectArray[0] = car;
        objectArray[1] = car2;
        objectArray[2] = car3;
        objectArray[3] = car4;
        objectArray[4] = car5;

        for (Object o : objectArray) {
            System.out.println(o);
        }
    }
}
