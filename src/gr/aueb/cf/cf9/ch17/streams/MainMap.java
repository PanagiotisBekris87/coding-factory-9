package gr.aueb.cf.cf9.ch17.streams;

import gr.aueb.cf.cf9.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMap {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> squares = numbers.stream()
                .map(num -> num * num)           // Intermediate op
                .toList();                              // Terminal op
        squares.forEach(System.out::println);


        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 100),
                new Product("Oranges", 8.1, 50),
                new Product("Milk", 2.8, 100),
                new Product("Apples", 22.5, 120)
        ));


        // Έχουμε τα products και θέλουμε να πάρουμε π.χ. μόνο τα descriptions
        var listOfDescriptions = products.stream()
                .map(Product::getDescription)        //.map(p -> p.getDescription()     -- Για κάθε product getDescription
                .toList();                           // Η map διαφέρει από την filter επειδή δεν μου φέρνει πίσω ολόκληρα Products
                                                     // Επιστρέφει τα Strings από το description
        listOfDescriptions.forEach(System.out::println);


        String listOfDescriptions2 = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.joining(", "));
        System.out.println("listOfDescriptions2 = " + listOfDescriptions2);


    }
}
