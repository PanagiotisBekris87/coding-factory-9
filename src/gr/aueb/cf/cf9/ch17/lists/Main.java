package gr.aueb.cf.cf9.ch17.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        // Add
        cities.add("Athens");
        cities.add("Berlin");
        cities.add("Paris");

        // Get
        String myCity = cities.get(0);       // Athens
        System.out.println(myCity);          // Athens

        // Set - Update  (Προϋποθέτουν ότι υπάρχει το element)

        int position = cities.indexOf("Paris");     // override την equals αν έχουμε κάποια άλλη κλάση δική μας
                                                    // εδώ έχουμε την String, που έχει υλοποίηση της equals

        if (position == -1) {                       // Αν δεν υπάρχει επιστρέφει -1.
            System.out.println("City not found.");
        } else {
            cities.set(position, "Tokyo");
        }


        // Remove
        if (cities.contains("Tokyo")) {
            cities.remove("Tokyo");             // override equals
        } else {
            System.out.println("City not found.");
        }


        // Traverse with for    (1 of 4)
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        // Traverse with enhanced for  (2 of 4)
        for (String city : cities) {
            System.out.println(city);
        }

        // Iterator - (χαμηλού επιπέδου μηχανισμός) - (σαν την C++ pointer?)    (3 of 4)
        Iterator<String> iterator = cities.iterator();      // αρχικοποίηση του iterator
                                                            // μετά την αρχικοποίηση ο iterator δείχνει πριν από το πρώτο στοιχείο
        while (iterator.hasNext()) {
            String town = iterator.next();
            System.out.println(town);
        }
        // Αν θέλουμε να ξανα-διασχίσουμε με iterator πρέπει να ξανα-αρχικοποιήσουμε έναν καινούργιο iterator

        Iterator<String> iter2 = cities.iterator();
        while (iterator.hasNext()) {
            if (iter2.next().equals("Tokyo")) {
                iter2.remove();             // Όχι cities.remove("Tokyo"); είναι λάθος. it fails fast with exception
            }
        }

        // (4 of 4)    functionally με Lambda
        cities.removeIf(c -> c.equals("Tokyo"));        // To Lambda αυτό επιστρέφει boolean
                       // Για κάθε city c                     // Αν true ενεργοποιείται η removeIf

        cities.forEach(c -> System.out.println(c));     // και επειδή περιέχει δύο φορές το c μπορεί να Υπονοηθεί
        // και ισοδυναμεί
        cities.forEach(System.out::println);



    }

}
