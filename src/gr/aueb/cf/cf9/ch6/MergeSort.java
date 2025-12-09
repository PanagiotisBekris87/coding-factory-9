package gr.aueb.cf.cf9.ch6;

import java.util.Random;

/**
 * Merge Sort
 */
public class MergeSort {

    public static void main(String[] args) {

        Random random = new Random();

        int[] arrSorted50K = new int[50_000];

        int[] arrRandom50K = new int[50_000];

        for (int i = 0; i < 50_000; i++) {
            arrRandom50K[i] = random.nextInt(50_000);
        }

        for (int i = 1; i < 50_000; i++) {
            arrSorted50K[i] = i;
        }

        long startTime = System.nanoTime();

        int[] sorted;

        System.out.println("Before sorting:");
        printArray(arrRandom50K);

        sorted = mergeSort1(arrRandom50K, 0, arrRandom50K.length - 1);

        System.out.println("After sorting:");
        printArray(sorted);

        long endTime = System.nanoTime();
        long durationNano = endTime - startTime;
        double durationMillis = (double) durationNano / 1_000_000.0;
        System.out.println("---");
        System.out.println("Χρόνος εκτέλεσης (Milliseconds): " + durationMillis + " ms");
    }



    public static int[] mergeSort1(int[] arr, int low, int high) {

        // if arr. length = 1 return arr[high]
        if (high - low <= 0) {
            return new int[] { arr [high] };
        }

        int middle = (high + low) / 2;

        int[] left = mergeSort1(arr, low, middle);
        int[] right = mergeSort1(arr, middle + 1, high);

        return merge(left,right);
    }

    public static int[] merge(int[] left, int[] right) {

        int[] merged = new int [left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while ((i < left.length) && (j < right.length)) {

            if (left[i] < right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < right.length) {
            merged[k++] = right[j++];
        }
        return merged;
    }

    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

}
