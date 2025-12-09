package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * Δημιουργείται ένα {@link ArithmeticException} χωρίς να το χειριστούμε.
 * (Αυτό είναι λάθος προγραμματιστή)
 */
public class Arithmetic1App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two mumbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        result = num1 / num2;       // αν num2 == 0 θα δώσει ArithmeticException

        System.out.println("result = " + result);
    }
}
