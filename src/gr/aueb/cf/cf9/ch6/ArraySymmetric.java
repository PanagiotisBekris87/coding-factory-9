package gr.aueb.cf.cf9.ch6;

/**
 * Ελέγχει αν ενας πινακας ειναι συμμετρικος ή οχι.
 * Συμμετρικος ειναι ενας πινακας αν διαβαζεται το ιδιο
 * και απο την αρχη και απο το τελος.
 * π.χ. [1, 2, 3, 3, 2, 1]
 * [1, 2, 3, 2, 1]
 */
public class ArraySymmetric {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 8, 3, 2, 1 };
        int[] arr2 = { 1, 2, 3, 3, 2, 1 };
        int[] arr3 = { 1, 2, 3, 4, 2, 1 };

        System.out.println("arr1 is symmetric: " + isSymmetric(arr1));
        System.out.println("arr2 is symmetric: " + isArraySymmetric(arr2));
        System.out.println("arr3 is symmetric: " + isSymmetric(arr3));

    }

    public static boolean isSymmetric (int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            if (arr[i] != arr[arr.length - i - 1]) {
                  return false;
            }
        }
        return true;
    }

    // Διαφορετική υλοποίηση

    public static boolean isArraySymmetric (int[] arr) {

        boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

}
