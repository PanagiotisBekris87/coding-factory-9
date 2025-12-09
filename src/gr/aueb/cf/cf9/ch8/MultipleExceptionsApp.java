package gr.aueb.cf.cf9.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("test.txt");
        char ch = ' ';

        try (Scanner scanner = new Scanner(file)) {         // Ακολουθούμε την σειρά των Exceptions βάση
            ch = (char) System.in.read();                   // κληρονομικότητας. Από το πιο ειδικό στο
        } catch (FileNotFoundException e) {                 // πιο γενικό γιατί θέλουμε διαφορετικά μηνύματα
            System.out.println("File not found");           // κατά περίπτωση
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("char read error");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}
