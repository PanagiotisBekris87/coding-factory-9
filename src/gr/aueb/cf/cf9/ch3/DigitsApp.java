package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το πληθος των ψηφιων ενος ακεραίου.
 * Για παραδειγμα αν ο ακέραιος είναι ο 178, το
 * πληθος των ψηφίων είναι 3
 */
public class DigitsApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int newNum = 0;
        int digits = 0;

        System.out.println("Παρακαλώ δώστε έναν αριθμό για καταμέτρηση των ψηφίων");
        number = scanner.nextInt();
        newNum = number;

        do {
            newNum = newNum / 10;
            digits++;
            } while ( newNum != 0);

        System.out.printf("The number %d has %d digits.\n", number, digits);
    }

}
