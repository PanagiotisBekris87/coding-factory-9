package gr.aueb.cf.cf9.ch5;

/**
 * calculates a^n using recursion
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {

        int result = 0;
        int base = 5;
        int exp = 4;

        result = power(base, exp);

        System.out.println("result = " + result);

    }

    public static int power (int a,int n) {

        return (n == 0) ? 1 : a * power(a, n - 1);
    }
}
