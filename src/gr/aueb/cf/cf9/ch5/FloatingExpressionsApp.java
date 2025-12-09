package gr.aueb.cf.cf9.ch5;

/**
 * Demo of floating point Expressions
 */
public class FloatingExpressionsApp {

    public static void main(String[] args) {

        int intNum = 10;
        float floatNum = 10.5f;
        double doubleNum = 10.56789;

        double result = 0.0;

        result = intNum + floatNum + doubleNum;
        // όλα μετατρέπονται στο μεγαλύτερο τύπο
        // auto-widening

        System.out.println("Result: " + result);
        System.out.printf("Result: %.2f\n", result);
    }
}
