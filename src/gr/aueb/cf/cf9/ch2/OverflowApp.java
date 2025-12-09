package gr.aueb.cf.cf9.ch2;

/**
 * Προσθέτει 2 ακεραίους και το αποτέλεσμα δημιουργεί υπερχείλιση (overflow). *
 */
public class OverflowApp {

    public static void main(String[] args) {


        int num1 = Integer.MAX_VALUE;
        int num2 = 1;
        int result = 0;

        result = num1 + num2;

        System.out.printf("Num 1: %,d\n", num1);
        System.out.printf("Το αποτέλεσμα είναι: %,d\n", result);
    }
}
