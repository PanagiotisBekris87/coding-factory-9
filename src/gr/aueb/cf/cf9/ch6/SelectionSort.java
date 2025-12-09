package gr.aueb.cf.cf9.ch6;

import java.util.Random;

/**
 * Selection Sort Algorithm
 */

public class SelectionSort {

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
        printArray(arrSorted50K);

        sorted = selectionSort(arrSorted50K);

        System.out.println("After sorting:");
        printArray(sorted);

        long endTime = System.nanoTime();
        long durationNano = endTime - startTime;
        double durationMillis = (double) durationNano / 1_000_000.0;
        System.out.println("---");
        System.out.println("Χρόνος εκτέλεσης (Milliseconds): " + durationMillis + " ms");
    }

    public static int[] selectionSort(int[] arr) {

        int minPosition = 0;
        int minValue = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            minPosition = i;
            minValue = arr[i];

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < minValue) {
                    minPosition = j;
                    minValue = arr[minPosition];
                }
            }
            swap(arr, minPosition , i);
        }
        return arr;

    }

    public static void swap(int[] arr, int i, int j) {

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

}
