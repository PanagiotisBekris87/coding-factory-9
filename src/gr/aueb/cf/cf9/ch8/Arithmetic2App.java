package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class Arithmetic2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two mumbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        try {
            result = num1 / num2;
            System.out.println();
        } catch (ArithmeticException e) {               // Βέβαια αυτό είναι runtime exception κανονικά
            e.printStackTrace();                        // Τα runtime δεν θέλουμε να τα κουκουλώνουμε με try-catch
            System.err.println(e.getMessage());
        }

        System.out.println("result = " + result + "");  // This line will be executed no matter what.
    }




}
