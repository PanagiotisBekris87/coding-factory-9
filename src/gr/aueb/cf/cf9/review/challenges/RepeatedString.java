package gr.aueb.cf.cf9.review.challenges;

/**
 * Δοθέντος ενός {@link String} επιστρέφει ένα String
 * που αποτελεί επανάληψη του αρχικού String, n φορές
 */
public class RepeatedString {

    public static void main(String[] args) {

    }

    public static String repeatStringTimesN(String string, int times) {

        if (string == null) {
            throw new RuntimeException("The given string cannot be null.");
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < times; i++) {
            sb.append(string);
        }
        return sb.toString();
    }

    //Υπάρχει και η έτοιμη repeat
    public static String repeatStringTimesN2(String string, int times) {
        return string.repeat(times);
    }
}
