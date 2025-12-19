package gr.aueb.cf.cf9.ch17.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> bag = new HashSet<>();

        bag.add("aplle");
        bag.add("banana");
        bag.add("orange");
        bag.add("aplle");       // No duplicates allowed
                                // Δεν ρίχνει exception απλά δεν το κάνει

        // Δεν υπάρχει update - απλά remove και add
        if (!bag.contains("apple")) {           // override equals
            bag.remove("apple");
        } else {
            System.out.println("Apple not included in the bag");
        }

        // traverse με method reference
        bag.forEach(System.out::println);

        bag.removeIf(item -> item.startsWith("b"));
    }
}
