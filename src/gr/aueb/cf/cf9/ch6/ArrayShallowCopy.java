package gr.aueb.cf.cf9.ch6;

/**
 * Οταν κανουμε copy references, τότε το copy ονομαζεται
 * shallow και εχει side effects.
 */
public class ArrayShallowCopy {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1;

        // Λέγεται shallow copy
        // Αυτο είναι αντιγραφη δεικτη
        // Δηλαδή απλά δείχνουν και οι δύο στην ίδια θέση του heap

        arr2[0] = 1000;

        System.out.println("arr1[0] = " + arr1[0]);

        // Είναι παράδειγμα προς αποφυγή

        System.out.println("address arr1 " + arr1);
        System.out.println("address arr2 " + arr2);



    }



}
