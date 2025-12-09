package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

/**
 * Βασικές απλές πράξεις σε πίνακες (συλλογές δεδομένων)
 */
public class ArraysAsCollections {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] evens;

        evens = filterEven(arr);

        for (int el : evens) {
            System.out.print(el + ", ");
        }


    }


    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];

        //Μετράμε τους άρτιους
        //int count = 0;

//        for  (int el : arr) {
//            if (el % 2 == 0) count++;
//        }
//
//           //Αρχικοποιούμε τον πίνακα με μέγεθος όσοι ήταν οι άρτιοι
//        int[] arrayToReturn = new int[count];
//
//        //και κάνουμε populate
//        int k = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                arrayToReturn[k++] = arr[i];
//            }
//        }
//        return arrayToReturn;

        // Διαφορετικά μπορούμε να αρχικοποιήσουμε με to
        // μέγεθος της arr (που πιθανότατα όμως θα είναι
        // μεγαλύτερο απ όσο χρειάζεται)

        int[] arrayToReturn = new int[arr.length];
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) {
                arrayToReturn[count++] = el;
            }
        }
        return Arrays.copyOf(arrayToReturn, count);
        // Στην Arrays.copyOf(arrayToReturn, count) αντιγράφει
        // και επιστρέφει μόνο μέχρι το μέγεθος count, δηλαδή όσο
        // χρειαζόμαστε, και τα υπόλοιπα (που θα είναι μηδενικά)
        // τα αποκόπτει.
    }

    public static int[] mapToDouble(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];

        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int el : arr) {
            sum += el;
        }
        return sum;
    }

    public static double avg(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    public static boolean anyEven(int[] arr) {
        for (int el : arr) {
            if (el % 2 == 0) return true;
        }
        return false;
    }

    public static boolean allEven(int[] arr) {
        for (int el : arr) {
            if (el % 2 != 0) return false;
        }
        return true;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0;
        for (int el : arr) {
            if (el % 2 == 0) count++;
            if (count > 2) return true;     // early exit
        }
        return false;
    }

}
