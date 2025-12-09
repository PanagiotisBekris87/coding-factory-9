package gr.aueb.cf.cf9.ch6;

/**
 * Βρίσκει το μικρότερο στοιχείο του πίνακα
 */
public class ArrayMinMax {

    public static void main(String[] args) {
        int [] arr = { 22, 82, 73, 58, 44, 88, 13, 56, 46, 54, 89, 46, 72, 32};
        int posMin = getMinPosition(arr);
        int posMax = getMaxPosition(arr);

        System.out.println("Min position: " + (posMin + 1));
        System.out.println("Min value: " + arr[posMin]);
        System.out.println("max pos: " + (posMax + 1) + " max value: " + arr[posMax]);
    }

    public static int getMinPosition(int[] arr) {

        if (arr == null || arr.length == 0) return -1;

        int minPosition = 0;
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {        //Συκριση
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    // Εναλλακτική μορφή
    // Θέτουμε για minValue μία πολύ μεγάλη τιμή. (τη μέγιστη βασικά εδώ)

    public static int getMinPosition2(int[] arr) {

        if (arr == null || arr.length == 0) return -1;

        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }


    // Υλοποιώ με αυτή την λογική την Max

    public static int getMaxPosition(int[] arr) {

        if (arr == null || arr.length == 0) return -1;

        int maxPosition = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }







}
