package gr.aueb.cf.cf9.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Η {@link BankApp} παρέχει μία μόνο υπηρεσία,
 * την υπηρεσία κατάθεσης.
 */
public class BankApp {

    static double balance = 0.0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double amount = 0.0;


        try {
            System.out.println("Παρακαλώ εισάγετε ποσό για κατάθεση");
            amount = scanner.nextDouble();
            deposit(amount);
            System.out.println("To υπόλοιπο μετά την κατάθεση είναι: " + balance);
        } catch (Exception e) {
            System.out.println("Δεν μπορεί να γίνει κατάθεση αρνητικού ποσού");
        }


    }

    /**
     * Deposit n amount of money.
     * @param amount        the amount of deposit
     * @throws Exception    if the amount is negative
     */
    public static void deposit (double amount) throws Exception {

        try {
            // επιχειρησιακά δεν μπορούμε να έχουμε αρνητικά ποσά
            if (amount < 0) {
                throw new Exception("Amount cannot be negative");       // γίνεται αυτόματα broadcast στην main
            }                                                          // πρέπει να δηλώνεται και στην επικεφαλίδα
                                                                        // της μεθόδου
            // Η κανονική πράξη της μεθόδου
            balance += amount;                          // Κανονικά και στο καλό σενάριο πρέπει να κάνουμε logging

        } catch (Exception e) {     // εδώ κάνουμε catch το exception , καλή πρακτική
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage());    // logging, κανονικά σε άλλο αρχείο
            throw e;        // re-trowing the exception
        }
                // το κάνουμε rethrow διαφορετικά με το catch είναι σαν να το κρύβουμε.
                // και για να "λάβει γνώση" η main (να γίνει propagate το exception)
                // άρα πρέπει να υπάρχει στην επικεφαλίδα οπωσδήποτε.
    }

}
