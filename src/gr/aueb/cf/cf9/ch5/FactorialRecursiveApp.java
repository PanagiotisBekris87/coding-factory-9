package gr.aueb.cf.cf9.ch5;

/**
 * Calculates factorial using recursion.
 */
public class FactorialRecursiveApp {

    public static void main(String[] args) {
        int result = 0;

        result = facto(5);

        System.out.println("result = " + result);
    }

    public static int facto(int n) {

        if ( n == 1) return 1;
        return n * facto(n - 1);

        // ή θα μπορούσαμε με ternary
        // return (n <= 1) ? 1 : n * facto(n - 1);
    }
}
