package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * Αναζητά ένα στοιχείο σε ένα πίνακα
 */
public class ArraySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = { 11, 21, 18, 40, 50, 61, 72, 18, 96, 15};
        int value = 0;
        int position = 0;

        System.out.println("please enter a value to search for: ");
        value = scanner.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value: " + value + " found at position: " + (position + 1));
        }
    }

    /**
     * Επιστρέφει τη θέση του πρώτου στοιχείου του πίνακα που ισούται
     * με την τιμή αναζήτησης value.
     * Αν δεν υπάρχει επιστρέφει -1.
     * @param arr       input array
     * @param value     search value
     * @return          το position του πίνακα που βρέθηκε το στοιχείο,
     *                  αλλιώς -1.
     */
    public static int getPosition(int[] arr, int value) {

        if (arr == null) return -1;     // Σημαντικο γιατι αλλιως βγαινουν προβληματα
                                        // at runtime
        int positionToReturn = -1;

        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == value) {              //σύγκριση
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;


    }

    public static int getPosition1(int[] arr, int value) {

        if (arr == null) return -1;     // Σημαντικο γιατι αλλιως βγαινουν προβληματα
                                        // at runtime
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == value) {              //σύγκριση
                return i;
            }
        }
        return -1;
    }
}
