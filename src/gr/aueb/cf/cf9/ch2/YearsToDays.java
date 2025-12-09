package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει την ηλικία του σε έτη
 * και το πρόγραμμα επιστρέφει την ηλικία σε ημέρες,
 * όπου θεωρούμε ότι 1 έτος = 365 ημέρες.
 * π.σ. αν ηλικία 20 ετών , το αποτέλεσμα είναι 7300 ημέρες.
 */
public class YearsToDays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEARS = 365;
        int inputAgeInYears = 0;
        int ageInDays = 0;


        System.out.println("Παρακαλώ εισάγεται την ηλικία σας σε έτη");
        inputAgeInYears = scanner.nextInt();
        ageInDays = inputAgeInYears * DAYS_IN_YEARS;

        System.out.printf("Hλικία σε έτη %d, ηλικία σε ημέρες %d", inputAgeInYears, ageInDays);
    }
}
