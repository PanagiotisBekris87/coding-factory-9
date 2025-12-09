package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

/**
 * Demo string input/output
 */
public class StrIO {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = "";
        String str2 = "";

        System.out.println("Please enter two strings: ");
        str = scanner.next();           // Διαβάζει μέχρι να βρει whitespace (spaces, tab, new line)
        str2 = scanner.nextLine();      // Διαβάζει μέχρι να βρει new line

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
    }
}
