package owu.javahomework2.com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Numbers who multiplies 3 and 10: ");
        Arrays.stream(numbers)
                .filter(number -> number % 3 == 0 && number % 10 == 0)
                .map(number -> number * 3)
                .forEach(number -> System.out.print(number + " "));
    }
}

