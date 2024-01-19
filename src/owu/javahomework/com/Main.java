package owu.javahomework.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Orange");
        words.add("Banana");
        words.add("Apple");
        words.add("Grapes");
        words.add("Pineapple");
        words.add("Cherry");
        words.add("Kiwi");
        words.add("Mango");
        words.add("Strawberry");
        words.add("Blueberry");
        words.add("Peach");
        words.add("Watermelon");
        words.add("Pear");
        words.add("Plum");
        words.add("Raspberry");
        words.add("i");

        Collections.sort(words);

        List<String> filteredWords = words.stream()
                .filter(word -> word.length() < 4)
                .collect(Collectors.toList());

        System.out.println("Sorted and Filtered Word List: " + filteredWords);
    }
}
