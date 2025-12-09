package gr.aueb.cf.cf9.ch6;

/**
 * Έστω οτι αναπαριστούμε μεγάλους ακεραίους σε μορφή
 * πίνακα. Θέλουμε να προσθέσουμε τη μονάδα σε αυτό τον
 * ακέραιο.
 */
public class AddOneApp {

    public static void main(String[] args) {



    }


    /**
     * Προσθέτει τη μονάδα σε ένα πίνακα που
     * αναπαριστά ακέραιο.
     * @param arr   ο input πινακας
     * @return      ένα array με το αποτέλεσμα.
     */
    public static int[] addOne (int[] arr) {

        if (arr == null) return new int[0];


        int[] arrOut = new int[arr.length + 1];
        int carry = 1;
        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            sum = (arr[i] + carry);
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 1) arrOut[0] = 1;
        return arrOut;
    }


}
