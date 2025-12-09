package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * The user inserts the weight in kilograms and the program
 * calculates the weight in grams.
 */
public class KilosToGrams {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int CONVERSION_MULTIPLIER = 1000;
        int weighInKilos = 0;
        int weightInGrams = 0;

        System.out.println("Παρακαλώ εισάγεται το βάρος σας σε κιλά");
        weighInKilos = scanner.nextInt();
        weightInGrams = weighInKilos * CONVERSION_MULTIPLIER;

        System.out.printf("Βάρος σε κιλά %d, βάρος σε γραμμάρια %,d", weighInKilos, weightInGrams);
    }
}
