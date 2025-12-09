package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * Tο {@link NumberFormatException} συμβαίνει όταν
 * αποτυγχάνει η {@link Integer#parseInt(String)}
 */
public class NumberExceptionApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        int num = 0;

        System.out.println("Please enter a number: ");
        // inputStr = scanner.nextLine();

        while (!isInteger(inputStr = scanner.nextLine())) {
            System.out.println("Characters are not accepted");
        }

        num = Integer.parseInt(inputStr);
        System.out.println("num = " + num);
    }

    /**
     * Checks if the given string is an integer
     * @param s        string to check
     * @return          true if string is integer, false otherwise
     */
    public static boolean isInteger (String s) {
        return s.matches("-?[0-9]+");           // είναι regular expression (κάνουν recognise patterns)
    }                                                 // θα μάθουμε regular expressions στο μέλλον
}
