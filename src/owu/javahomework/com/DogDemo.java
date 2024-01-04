package owu.javahomework.com;

public class DogDemo {
    public static void main(String[] args) {
        Dog[] dogObject = new Dog[5];

        Dog dog = new Dog("Bobik", 3, "Ovcharka");
        Dog dog2 = new Dog("Homik", 2, "Homyak");
        Dog dog3 = new Dog("Bober", 1, "Bober");
        Dog dog4 = new Dog("Ananas", 5, "Ananas");
        Dog dog5 = new Dog("Kokos", 10, "Legend");

        dog.setName("Patron");
        dog.setAge(4);
        dog.setBreed("Jack Russell Terrier");

        dogObject[0] = dog;
        dogObject[1] = dog2;
        dogObject[2] = dog3;
        dogObject[3] = dog4;
        dogObject[4] = dog5;

        for (Object o : dogObject) {
            System.out.println(o);
        }
    }
}
