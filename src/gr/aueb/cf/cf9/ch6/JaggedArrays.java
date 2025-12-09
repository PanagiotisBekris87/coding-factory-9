package gr.aueb.cf.cf9.ch6;

/**
 * 2D arrays με διαφορετική διάσταση σε κάθε γραμμή
 *
 */
public class JaggedArrays {

    public static void main(String[] args) {

        int [][] arr = new int[3][];

        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[7];

        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
