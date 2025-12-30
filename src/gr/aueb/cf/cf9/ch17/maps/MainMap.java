package gr.aueb.cf.cf9.ch17.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Όταν έχουμε αναζητήσεις προτιμάμε τα Maps
 * γιατί έχει πολύ μικρό χρόνο αναζήτησης Ο(1).
 */
public class MainMap {

    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>();

        // Add & Update
        countries.put("GR", "Greece");              // insert
        countries.put("USA", "United States");
        countries.put("IT", "Italy");
        countries.put("GR", "Germany");             // Η put λειτουργεί και ως update


        // Get
        String country = countries.get("GR");
        System.out.println("country = " + country);

        // Remove
        countries.remove("USA");


        // Traverse
        countries.forEach((key, value) -> System.out.println(key + ", " + value));


        var filteredCountries = countries.entrySet()            //μετατροπη σε set , δλδ collection
                .stream()                        // και πλέον μπορούμε να χρησιμοποιήσουμε stream
                .filter(entry -> entry.getKey().length() <= 2 )     // όσα έχουν key μέχρι 2 γράμματα
                .collect(Collectors.toSet());

        filteredCountries.forEach(System.out::println);
    }
}
