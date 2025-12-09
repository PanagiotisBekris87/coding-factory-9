package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Ένας αριθμός Armstrong είναι ένας ακέραιος που
 * είναι ίσος με το άθροισμα των ψηφίων του όπου
 * το κάθε ψηφίο έχει υψωθεί στη δύναμη του
 * αριθμού των ψηφίων.
 * Για παράδειγμα, 153 = 1^3 +5^3 +3^3
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int numCopy = 0;
        int numberOfDigits = 0;
        int digit = 0;
        int sum = 0;

        System.out.println("Please enter a number");
        num = scanner.nextInt();
        numberOfDigits = String.valueOf(num).length();

        numCopy = num;

        while (numCopy != 0) {
            digit = numCopy % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            numCopy /= 10;
        }

        System.out.printf("%d %s Armstrong\n", num, (sum == num) ? "is" : "is not");
    }
}
