package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Οριζει δυο μεθοδους τις isEven και isOdd τον ελεγχο
 * ενος ακεραίου αν είναι αρτιος ή περιττος
 */
public class EvenOddApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Δώσε έναν ακέραιο αριθμό");
        num = scanner.nextInt();

        System.out.println("Ο αριθμός " + num + " είναι άρτιος: " + isEven(num));
        System.out.println("Ο αριθμός " + num + " είναι περιττός: " + isOdd(num));
    }




    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static boolean isOdd(int a) {
        return !isEven(a);
    }
}
