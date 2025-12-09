package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής demo. Υπολογίζει τον μικρότερο
 * μεταξύ δύο ακεραίων που δίνει ο χρήστης
 */
public class TernaryApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please enter two integers for comparison:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        // Conditional assignment with ternary operators
        min = (num1 < num2) ? num1 : num2;

        System.out.printf("The lowest number between %d and %d is %d", num1, num2, min);
    }
}
