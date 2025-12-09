package gr.aueb.cf.cf9.ch7;

/**
 * Δήλωση και αρχικοποίηση (populate)
 * ενός {@link String}
 */
public class StrInit {

    public static void main(String[] args) {

        String s1 = "Athens";                        // popular
        String s2 = new String("Athens");    // Not popular
        String s3 = "";
        boolean isEmpty;

        isEmpty = s3.length() == 0;     //υπάρχει και έτοιμη μέθοδος , δες από κάτω
        isEmpty = s3.isEmpty();

        System.out.println(s1);
        System.out.println("length: " + s1.length());
        System.out.printf("City: %s\n", s2);

    }
}
