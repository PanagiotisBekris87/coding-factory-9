package gr.aueb.cf.cf9.review.challenges;

public class MissingElement {

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 4, 5, 6, 7 };
        int missing = 0;

        missing = findMissingElement(arr);
        System.out.println("missing = " + missing);
    }



    public static int findMissingElement (int[] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n = 0;

        n = arr.length + 1;
        expectedSum = (n * (n + 1)) / 2;

        for (int item : arr) {
            actualSum += item;
        }
        return expectedSum-actualSum;
    }



    public static int findMissingElement2 (int[] arr) {

        int missing = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( i + 1 != arr[i]) {
                missing = i + 1;
                break;
            }
        }
        return missing;
    }
}
