package gr.aueb.cf.cf9.ch8;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyApp {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);           // resource
        int num = 0;

        // κανονικά επειδή είναι runtime δεν το χειριζόμαστε έτσι
        // το κάνουμε για demo εδώ

//        try {
//            num = scanner.nextInt();
//            System.out.println("num = " + num);
//        } catch (InputMismatchException e) {
//            System.err.println("Error: " + e.getMessage());
//        } finally {                                         // θέλουμε να κλείσουμε το scanner
//            try {                                           // πάλι μπορεί να δημιουργηθεί λάθος
//                if (scanner != null) {
//                    scanner.close();
//                }
//            } catch (Exception ex) {
//                   System.err.println("Error: " + ex.getMessage());
//                   ex.printStackTrace();
//            }
//        }

        // Το ίδιο με το από πάνω ακριβώς αλλά και πιο απλό
        // Υπάρχει και έτοιμο try with resources


//        try (Scanner scanner = new Scanner(new File("C:/users/a8ana/data.txt")) {
//            num = scanner
//            System.out.println("num = " + num);
//        } catch (InputMismatchException | FileNotFoundException e) {        // συντακτικό ή στα exceptions
//            System.err.println("Error: " + e.getMessage());                 // μία κάθετος όχι 2 || όπως στις boolean
//            e.printStackTrace();                                            // μοιάζει με bitwise or αλλά δεν είναι
//                                                                    // δεν χρειάζεται να κλείσουμε το scanner ρητά
//                                                                    // το κάνει μόνη της
//        }
    }
}