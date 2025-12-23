package gr.aueb.cf.cf9.ch17.streams;

import gr.aueb.cf.cf9.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.List;

/**
 *  {@link java.util.Optional}
 */
public class OptionalMain {

    public static void main(String[] args) throws Exception {

        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 100),
                new Product("Oranges", 8.1, 50),
                new Product("Milk", 2.8, 100),
                new Product("Apples2", 22.5, 120)
        ));


//        Product product = products.stream()
//                .filter( p -> p.getPrice() >= 20 )
//                .findFirst()
//                .orElse(new Product("No product found", 0, 0)); // Η find first επιστρέφει Optional


        Product product = products.stream()
                .filter( p -> p.getPrice() >= 20 )
                .findFirst()                                                    // Η find first επιστρέφει Optional
                .orElseThrow(() -> new Exception("No product found"));          // Η orElseThrow είναι μέθοδος του @link {Optional}




    }
}
