package gr.aueb.cf.cf9.ch6;

/**
 * Tracerse an array. Διάσχιση, επίσκεψη
 * και εκτύπωση
 */
public class ArrayTraverse {

    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int [] grades = { 10, 9, 8, 7, 6 };
        int[] scores = new int[] { 100, 90, 80, 70, 60 };

        // Traverse (error prone)
        for (int i = 0; i < 5; i++) {
            System.out.println(arr1[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(grades[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(scores[i]);
        }

        //Enhanced for      -- Not error prone
        for (int grade : grades) {
            System.out.print(grade + " ");
        }

        for (int score : scores) {
            System.out.print(score + " ");
        }

    }
}
