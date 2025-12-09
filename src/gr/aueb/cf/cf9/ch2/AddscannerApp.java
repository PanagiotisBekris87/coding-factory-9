package gr.aueb.cf.cf9.ch2;

//import java.lang.*;           Γίνεται import implecetely και περιέχει τα main , print κτλ.
import java.util.Scanner;

/**
 * Διαβάζει δύο ακεραίους από το stdin (keyboard)
 * και υπολογίζει το άθροισμά τους.
 */
public class AddscannerApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Εντολές
        System.out.println("Παρακαλώ εισάγεται δύο ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        // Εκτύπωση αποτελέσματος στην κονσόλα
        System.out.printf("Το άθροισμά των %d και %d είναι %d", num1, num2, sum);
    }
}
