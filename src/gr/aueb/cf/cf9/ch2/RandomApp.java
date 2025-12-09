package gr.aueb.cf.cf9.ch2;

/**
 * Παράγει δύο τυχαίους ακέραιους μεταξύ 1 - 6
 * (ζάρια για τάβλι)
 */
public class RandomApp {

    public static void main(String[] args) {

        int die1 = 0;
        int die2 = 0;

        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;

        System.out.println("Die1 is: " + die1);
        System.out.println("Die2 is: " + die2);
    }
}
