package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

/**
 * From string to int
 */
public class StrTypecast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lexeme = "";
        int num = 0;

        System.out.println("please enter an integer: ");
        lexeme = scanner.nextLine();
        num = Integer.parseInt(lexeme);                 // Integer.parseInt(String)

        System.out.println("num = " + num);

    }
}
