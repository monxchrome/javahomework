package owu.javahomework3.com;

import owu.javahomework3.com.models.Car;
import owu.javahomework3.com.models.Owner;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        Owner owner1 = new Owner("Stefan", 18, 1);
        Owner owner2 = new Owner("Alice", 25, 2);
        Owner owner3 = new Owner("Bob", 35, 4);
        Owner owner4 = new Owner("Eva", 28, 10);
        Owner owner5 = new Owner("Mike", 40, 20);

        cars.add(new Car("Toyota", 150, owner1, 20000, 2019));
        cars.add(new Car("Honda", 120, owner2, 18000, 2020));
        cars.add(new Car("Ford", 180, owner3, 25000, 2018));
        cars.add(new Car("Chevrolet", 200, owner4, 30000, 2022));
        cars.add(new Car("Nissan", 170, owner5, 22000, 2021));
        cars.add(new Car("BMW", 250, owner1, 40000, 2020));
        cars.add(new Car("Mercedes", 220, owner2, 35000, 2019));
        cars.add(new Car("Audi", 200, owner3, 32000, 2021));
        cars.add(new Car("Volkswagen", 160, owner4, 23000, 2018));
        cars.add(new Car("Hyundai", 140, owner5, 19000, 2022));

        var totalCost = cars.stream().limit(cars.size() / 2).peek(car -> {
            int newPower = (int) (car.getEngine_power() * 1.1);
            car.setEngine_power(newPower);
            System.out.println("Car repaired: "+ car);
        }).peek(car -> {
            if (car.getOwner().getYearsOfDriving() < 5 && car.getOwner().getYearsOld() > 25) {
                int yearsOfDriving = car.getOwner().getYearsOfDriving();
                car.getOwner().setYearsOfDriving(yearsOfDriving + 1);
                System.out.println("Owner: " +
                        car.getOwner().getName() + "'s experience + 1: " + car.getOwner().getYearsOfDriving());
            }
        }).mapToDouble(Car::getPrice).sum();

        System.out.println(totalCost);
    }
}
