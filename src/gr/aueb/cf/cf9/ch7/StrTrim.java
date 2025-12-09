package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class StrTrim {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstname = "";

        System.out.println("Please enter your firstname: ");
        firstname = scanner.nextLine().trim();      //chaining

        System.out.println("firstname = " + firstname);     //trimmed
    }
}
