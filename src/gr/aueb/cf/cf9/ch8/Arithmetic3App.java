package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class Arithmetic3App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        // Κανονικά τα Runtime exception είναι προβλήματα που πρέπει να τα
        // "προλάβει" ο προγραμματιστής
        while (true) {

            System.out.println("Please enter two numbers (0 for exit): ");
            num1 = scanner.nextInt();
            if (num1 == 0) break;

            //Validation αντί για try catch, state-test
            num2 = scanner.nextInt();
            if (num2 == 0) {
                System.out.println("Denominator cannot be zero.");
                continue;
            }
            result = num1 / num2;
            System.out.println("result = " + result);
        }
    }
}