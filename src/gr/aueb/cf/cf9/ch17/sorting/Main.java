package gr.aueb.cf.cf9.ch17.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>( List.of(                      // Η List.of είναι Structurally Unmodifiable
                new Product("Apples", 12.5, 100),       // Δεν επιτρέπονται CRUD ενέργειες
                new Product("Oranges", 8.1, 50),        // Γι' αυτό την βάζουμε μέσα σε μία ArrayList
                new Product("Milk", 2.8, 10),
                new Product("Apples", 22.5, 120)
        ));

        // Ascending order
        products.sort(Comparator.naturalOrder());       // Επειδή έχουν υλοποιήσει την compareTo
        products.forEach(System.out::println);

        products.sort(Comparator.reverseOrder());       // Descending order

         //
         //
         //
         //
        // και χωρίς να είχαμε υλοποιήσει την compareTo
         //
         //
         //
         //

        products.sort(Comparator.comparing(product -> product.getPrice()));

        products.sort(Comparator.comparing(Product::getPrice));     //Είναι ίδιο με το από πάνω
        // products.sort((a, b) -> Double.compare(a.getPrice(), b.getPrice()) );        // Υλοποίηση του comparable με lambda μέσα στην main
                                                                                        // Αν δεν είχαμε φτάξει την compareTo
        products.sort(Comparator.comparing(Product::getPrice));


        products.sort(Comparator.comparing(Product::getQuantity)
                .thenComparing(Product::getPrice , Comparator.reverseOrder())       // price descending
                .thenComparing(Product::getDescription));


        products.sort(Comparator.comparing(Product::getQuantity)
                .thenComparing(Product::getPrice)
                .thenComparing(Product::getDescription).reversed()              // εδώ αντιστρέφεται συνολικά το output όχι το κάθε πεδίο
        );

    }
}
