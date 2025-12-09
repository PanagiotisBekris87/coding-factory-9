package gr.aueb.cf.cf9.review.junior_level;

/*
 * Οι μεταβλητές a, m δεν είναι 'καλά' ονόματα
 * Ο κώδικας θα μπορούσε να είναι μέθοδος
 * Δεν έχει documentation
 * Δεν υπάρχει έλεγχος για κενό array
 * Δεν έχει δομή
 * Δεν έχει SoC (Separation of concerns)
 */
public class ArrayMax {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 6, 8, 11, 15, 20 };

        int m = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        System.out.println("max = " + m);
    }
}
