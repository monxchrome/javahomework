package owu.javahomework.com;

public class DogDemo {
    public static void main(String[] args) {
        Object[] arrayObject = new Object[5];

        Dog dog = new Dog("Bobik", 3, "Ovcharka");
        Dog dog2 = new Dog("Homik", 2, "Homyak");
        Dog dog3 = new Dog("Bober", 1, "Bober");
        Dog dog4 = new Dog("Ananas", 5, "Ananas");
        Dog dog5 = new Dog("Kokos", 10, "Legend");

        dog.setName("Patron");
        dog.setAge(4);
        dog.setBreed("Jack Russell Terrier");

        arrayObject[0] = dog;
        arrayObject[1] = dog2;
        arrayObject[2] = dog3;
        arrayObject[3] = dog4;
        arrayObject[4] = dog5;

        for (Object o : arrayObject) {
            System.out.println(o);
        }
    }
}
