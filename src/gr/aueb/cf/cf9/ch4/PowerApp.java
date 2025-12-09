package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Ο Χρήστης εισάγει τα base και power και το
 * προγραμμα υπολογίζει το base^power
 * π.χ. 2^10 = 1024
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Δώστε την τιμή της βάσης της δύναμης");
        base = scanner.nextInt();
        System.out.println("Δώστε την τιμή του εκθέτη της δύναμης");
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.printf("H δύναμη %d εις την %d ισούται με %d", base, power, result);

    }

}
