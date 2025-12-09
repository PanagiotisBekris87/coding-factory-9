package gr.aueb.cf.cf9.review.challenges;

/**
 * Από ένα σημείο χ, να πάει σε ένα σημείο y
 * όπου κάθε άλμα είναι jump.
 *
 * έστω
 * x = 10
 * y = 55
 * jump = 25
 *
 * 2 jumps
 */
public class FrogJumps {

    public static void main(String[] args) {

    }

    // μη βελτιστο
    public static int frogJumps(int start, int end, int jump) {
        int jumpCount = 0;

        while (start < end) {
            jumpCount++;
            start += jump;
        }
        return jumpCount;
    }

    // ceil είναι άνω όριο
    public static int frogJumps2(int start, int end, int jump) {
        return (int) Math.ceil((end - start) / (double) jump);
    }



}
