package owu.javahomework.com;

public class Dog {
    String name;

    int age;

    String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge(int age) {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getBreed(String breed) {
        return breed;
    }

    public void setBreed(String newBreed) {
        breed = newBreed;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Age: " + age + '\n' +
                "Breed: " + breed + '\n';
    }
}
