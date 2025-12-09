package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Calculates Hours to Minutes and Seconds for a given number of hours.
 *
 */
public class HoursToMinSec {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int MINUTES_IN_AN_HOUR = 60;
        final int SECONDS_IN_AN_HOUR = 3600;
        long hours = 0;
        long minutes = 0;
        long seconds = 0;

        System.out.println("Παρακαλώ εισάγεται αριθμό ωρών");
        hours = scanner.nextInt();
        minutes = hours * MINUTES_IN_AN_HOUR;
        seconds = hours * SECONDS_IN_AN_HOUR;

        System.out.printf("%d ώρες = %,d λεπτά = %,d δευτερόλεπτα", hours, minutes, seconds);
    }
}
