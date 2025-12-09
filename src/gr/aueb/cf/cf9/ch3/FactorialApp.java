package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates factorial of a number
 * n! = 1*2*3*...*n.
 * For instance 5! = 1*2*3*4*5.
 */
public class FactorialApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfFactorial = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please give an integer number to calculate its factorial.");
        numberOfFactorial = scanner.nextInt();

        while (i <= numberOfFactorial) {
            result *= i;
            i++;
        }

        System.out.printf("Factorial of %d is: %d", numberOfFactorial, result);

    }
}
