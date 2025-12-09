package gr.aueb.cf.cf9.ch5;

/**
 * Demo of method overloading
 * Overload = same name of method, different parameters
 */
public class MethodOverloading {

    public static void main(String[] args) {

        int sum1 = 0;
        long sum2 = 0L;
        int sum3 = 0;

        sum1 = add(10, 20);
        sum2 = add(10L, 25L);
        sum3 = add(10, 5, 8);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);

    }

    public static int add (int num1, int num2) {
        return num1 + num2;
    }

//    public static long add (int num1, int num2) {
//        return num1 + num2;                           // ΔΕΝ γίνεται αυτό
//    }

    // overloaded
    public static long add (long num1, long num2) {
        return num1 + num2;                             // Αυτό γίνεται!
    }

    public static int add (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static long add (int num1, int num2, long num3) {
        return num1 + num2 + num3;
    }

    public static long add (long num1, long num2, long num3) {
        return num1 + num2 + num3;
    }
}
