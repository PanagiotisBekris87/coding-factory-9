package gr.aueb.cf.cf9.ch8;

public class IndexOutOfBoundsExceptionApp {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

//        for(int i = 0; i <= arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // Δεν θέλουμε να το "κουκουλώσουμε" με ένα try catch
        // Αυτό λέγεται mask των λαθών.
        // είναι προγραμματιστικό λάθος και πρέπει να διορθώσουμε τον κώδικά μας
        // i < arr.length     ή      i <= arr.length - 1

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
