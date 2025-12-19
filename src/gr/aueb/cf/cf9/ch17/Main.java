package gr.aueb.cf.cf9.ch17;

public class Main {

    public static void main(String[] args) {
        FlexibleNode flexibleNode = new FlexibleNode();

        flexibleNode.setValue("Coding");
        // No compile-time safety
        int value = (int) flexibleNode.getValue();
        // Θα πάρουμε runtime exception χωρίς να μπορεί να το αναγνωρίσει από πριν ο compiler
        // συγκεκριμένα class cast exception

        System.out.println("value = " + value);
    }
}
