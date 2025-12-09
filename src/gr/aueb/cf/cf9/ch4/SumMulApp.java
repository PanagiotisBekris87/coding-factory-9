package gr.aueb.cf.cf9.ch4;

/**
 * Υπολογίζει το άθροισμα και το γινόμενο τον 10 πρώτων ακεραίων
 * χρησιμοποιώντας την for.
 */
public class SumMulApp {

    public static void main(String[] args) {

        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            mul *= i;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);

    }
}
