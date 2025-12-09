package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calalcukates the power of a number, a^n.
 * a^n = a*a*a*a*....a (n times).
 */

public class PowerApp {

    public static void main(String[] args) {

        // Δήλωση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        // Είσοδος δεδομένων και αντιστοίχιση μεταβλητών
        System.out.println("Παρακαλώ δώστε τιμή για την βάση της δύναμης.");
        base = scanner.nextInt();
        System.out.println("Παρακαλώ δώστε τιμή για τον εκθέτη της δύναμης.");
        power = scanner.nextInt();

        // Επεξεργασία δεδομένων
        while (i <= power) {
            result *= base;
            i++;
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Το αποτέλεσμα %d^%d είναι: %d\n", base, power, result);
    }
}
