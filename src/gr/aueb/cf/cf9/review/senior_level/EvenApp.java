package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * This program calculates if a number is even.
 *
 * @author PB
 */

public class EvenApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        // Έλεχος Δεδομένων , Data Validation και Data Binding *
        System.out.println("Please enter a number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid Input. Please enter a number");
            scanner.nextLine();
        }
        num = scanner.nextInt();        // * Data Binding

        // Business Logic (Επιχειρησιακή λογική) - Παραστάσεις
        result = isEven(num);

        // Εκτύπωση αποτελέσματος
        System.out.println("The number is even: " + result);
    }

    /**
     * Checks if number is even.
     * @param num       the number to check.
     * @return          true if number is even, false otherwise
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;

    }
}
