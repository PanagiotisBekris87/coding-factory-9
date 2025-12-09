package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο που συμβολίζει μία
 * θερμοκρασία και το πρόγραμμα υπολογίζει αν η θερμοκρασία
 * είναι < 0 τότε μία μεταβλητή γίνεται true, αλλιώς
 * γίνεται false.
 */
public class TemperatureApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        // Εισαγωγή δεδομένων
        System.out.println("Παρακαλώ εισάγεται μία θερμοκρασία");
        temperature = scanner.nextInt();

        // Επεξεργασία δεδομένων
        isTempBelowZero = temperature < 0;

        // Εκτύπωση των αποτελεσμάτων
        System.out.println("Η θερμοκρασία είναι μικρότερη από το 0: " + isTempBelowZero);
    }
}
