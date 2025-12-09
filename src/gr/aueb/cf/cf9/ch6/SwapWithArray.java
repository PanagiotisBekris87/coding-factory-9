package gr.aueb.cf.cf9.ch6;

/**
 * Demo of pass by reference
 */

public class SwapWithArray {

    public static void main(String[] args) {

        int[] arr = { 1, 5 };

        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);

        swap(arr);

        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);


    }

    public static void swap(int[] arr) {
        if (arr.length != 2) return;

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;

    }



}
