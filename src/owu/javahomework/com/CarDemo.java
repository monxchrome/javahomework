package owu.javahomework.com;

public class CarDemo {
    public static void main(String[] args) {
        Car[] carArray = new Car[5];

        Car car = new Car("BMW M5", 220, 400, false);
        Car car2 = new Car("Mercedes GLE", 240, 450, false);
        Car car3 = new Car("Toyota Supra", 410, 2500, true);
        Car car4 = new Car("Toyota RAV4", 220, 380, false);
        Car car5 = new Car("Mazda RX-8", 330, 1300, true);

        car.setPower(225);

        carArray[0] = car;
        carArray[1] = car2;
        carArray[2] = car3;
        carArray[3] = car4;
        carArray[4] = car5;

        for (Object o : carArray) {
            System.out.println(o);
        }
    }
}
