package gr.aueb.cf.cf9.ch5;

public class EpsilonApp {

    public static void main(String[] args) {
        final double EPSILON = 0.000005;
        double actual = 0.0;
        double expected = 1.0;

        for (int i = 1; i <= 10; i++) {
            actual = actual + 0.1;
           // System.out.println("actual: " + actual);
        }
        System.out.println("Actual: " + actual);
        System.out.println("Expected: " + expected);

        // Αντί να συγκρίνουμε με ==
        // Κάνουμε το παρακάτω

        if (Math.abs(actual - expected) <= EPSILON) {
            System.out.println("Equal!");
        } else {
            System.out.println("Not equal!");
        }
    }
}
