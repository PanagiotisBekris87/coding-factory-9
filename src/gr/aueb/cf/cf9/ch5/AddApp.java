package gr.aueb.cf.cf9.ch5;

/**
 * Demo of addition method
 */
public class AddApp {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 8;
        int sum = 0;

        sum = add(num1, num2);

        System.out.println("Sum: " + sum);
    }


    // από εδώ και κάτω θα γραψουμε την μεθοδο
    // εξω απο την main

    // δεν χρειαζεται να την αρχικοποιησουμε οπως στην C


    public static int add(int a, int b) {

//      // Δήλωση και αρχικοποίηση
//      int sum = 0;
//
//      // Επεξεργασία των δεδομένων
//      sum = a + b;
//
//      // Επιστροφή αποτελέσματος
//      return sum;

        // Ή μπορούμε να γλιτώσουμε τα πάντα απο πάνω και να γράψουμε απλά:
        return a + b;
    }
}
