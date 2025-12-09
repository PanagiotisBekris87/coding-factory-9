package gr.aueb.cf.cf9.review.mid_level;

public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 8, 11, 15, 20 };
        int max = findArrayMax(arr);
        System.out.println("max = " + max);
    }

    public static int findArrayMax (int[] arr) {
        if (arr == null) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for (int el : arr) {
            if (el > max) max = el;
        }
        return max;
    }

}
