package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Ορίζει μία μέθοδο void swap(int a, int b) η οποία θα ανταλλάσει
 * αμοιβαία τις τιμές a, b.
 */
public class SwapApp {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.printf("a = %d , b = %d\n", a, b);

        swap(a, b);

        System.out.printf("a = %d , b = %d\n", a, b);
    }


    /**
     * Swaps two numbers.
     * @param a     the first number.
     * @param b     the second number.
     */
    public static void swap (int a , int b){
        int temp = a;

        a = b;
        b = temp;
    }








}
