package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα Μενού μέχρι ο χρήστης
 * να επιλέξει 'Exit' (3).
 */
public class Menu2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("παρακαλώ επιλέξτε από τα παρακάτω:");
            System.out.println("1. Εισαγωγή αίτησης");
            System.out.println("2. Διαγραφή αίτησης");
            System.out.println("3. Εισαγωγή αίτησης");
            choice = scanner.nextInt();
            if (choice == 3) {
                break;
            }
        }

        System.out.println("Thanks for using the program");
    }
}
