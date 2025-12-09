package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη ένα ακέραιο ποσό σε ευρώ
 * και το μετατρέπει σε δολάρια ΗΠΑ με βάση μία ισοτιμία.
 * Για παράδειγμα αν η ισοτιμία είναι 1 € = 0,99 $ τότε για ένα
 * Input 100 € θα επιστρέψει 99 δολάρια και 0 cents.
 */
public class EuroToUsdConverter {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int euroAmount = 0;
        int dollars = 0;
        int totalCents = 0;
        int remainingCents = 0;
        final int CENTS_TO_EURO_EXCHANGE_RATE = 99;
        final int CENTS_IN_A_DOLLAR = 100;

        // Data Input
        System.out.println("Please give the amount of Euros\n");
        euroAmount = scanner.nextInt();

        // Data Processing - Expressions
        totalCents = euroAmount * CENTS_TO_EURO_EXCHANGE_RATE;
        dollars = totalCents / CENTS_IN_A_DOLLAR;
        remainingCents = totalCents % CENTS_IN_A_DOLLAR;

        // Data Output
        System.out.printf("%d Euros are converted to %d Dollars and %d cents\n", euroAmount, dollars, remainingCents);
    }
}
