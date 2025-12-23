package gr.aueb.cf.cf9.ch17.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainFilter {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);       // Σαν την List.of. Είναι σχεδ'ον structurally unmodifiable
                                                                                    // Δεν επιτρέπει insert και delete αλλά επιτρέπει update


        // filter even numbers
        numbers.stream()
                .filter(num -> num % 2 == 0)         // Η filter είναι intermediate. Από μόνη της δεν κάνει τίποτα
                .forEach(System.out::println);              // χρειάζεται να κάνουμε chain και μία terminal μέθοδο για να πράξει κάτι.


        // αν θέλουμε να τα αποθηκεύσουμε κάπου, σε μία λίστα

        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)            // Intermediate op
                .toList();                                     // Unmodifiable list

        // Εναλλακτικά

        List<Integer> evenNumbers2 = numbers.stream()
                .filter(num -> num % 2 == 0)          // Intermediate op
                .collect(Collectors.toList());               // Unmodifiable list


        // Εναλλακτικά

        var evenNumbers3 = numbers.stream()
                .filter(num -> num % 2 == 0)        // Όλα IS-A Iterable
                .toArray();

        List<String> cities = List.of("Athens", "Berlin", "Paris", "Tokyo");

        var filteredCities = cities.stream()
                .filter(city -> city.startsWith("T"))
                .collect(Collectors.toCollection(ArrayList::new));      // Ή HashSet... Οτιδήποτε από Collections
                                                                        // η Collectors είναι πολύ ευέλικτη

        filteredCities.forEach(System.out::println);


        // Και στους απλούς πίνακες μπορούμε να χρησιμοποιήσουμε τις λειτουργικότητες των streams ως εξής

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        var filteredArr = Arrays.stream(arr)            // Χρειαζόμαστε την Wrapper Arrays. Δεν μπορούμε να κάνουμε απευθείας arr.stream()
                .filter(num -> num % 2 == 0)
                .toArray();






    }
}
