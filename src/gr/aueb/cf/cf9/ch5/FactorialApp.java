package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογιζει το παραγοντικο του n με μεθοδο
 * n! = 1*2*3*...n
 * και 0! = 1 παντα
 */
public class FactorialApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int result = 0;

        // Input data from user and data binding
        System.out.println("Please give a number to calculate the factorial of it");
        num = scanner.nextInt();

        // Call the service method - delegation
        result = calculateFactorial(num);       // Inject the num real parameter

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Factorial of %d is: %d\n", num, result);
    }


    /**
     *  Calculates factorial of n.
     *
     * @param n     The number to calculate factorial of.
     * @return      the factorial of n.
     */
    public static int calculateFactorial(int n) {

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
