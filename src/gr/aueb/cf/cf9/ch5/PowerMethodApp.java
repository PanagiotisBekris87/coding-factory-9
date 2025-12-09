package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 *  Υπολογίζει τη δύναμη α^b με μέθοδο
 */
public class PowerMethodApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int power = 0;

        System.out.println("Δώσε ένα ακέραιο για τη βάση της δύναμης");
        a = scanner.nextInt();

        System.out.println("Δώσε ένα ακέραιο για τον εκθέτη της δύναμης");
        b = scanner.nextInt();

        power = calculatePower(a, b);

        System.out.println("Το αποτέλεσμα της δύναμης είναι: " + power);
    }


    /**
     * Υπολογίζει την δύναμη ενος αριθμού a εις την b
     */
    public static int calculatePower(int a, int b) {

        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}
