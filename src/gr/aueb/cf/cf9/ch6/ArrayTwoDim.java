package gr.aueb.cf.cf9.ch6;

/**
 * Οριζει ενα 2D array και κανει populate τον
 * πινακα. 2D arrays οριζονται ως [γραμμή][στηλη]
 */
public class ArrayTwoDim {

    public static void main(String[] args) {

        int[][] grid2 = new int[2][3];

        grid2[0][0] = 1;
        grid2[0][1] = 2;
        // κοκ.

        //η εναλλακτικά

        int [][] grid = {
                { 1, 2, 3},
                { 4, 5, 6},
                { 7, 8, 9} };

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : grid) {
            for (int column : row) {

                System.out.print(column + " ");
            }
            System.out.println();
        }


    }
}
