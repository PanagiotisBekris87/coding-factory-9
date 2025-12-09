package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Λαμβάνει έναν βαθμό (grade) από τον χρήστη και ανάλογα
 * την βαθμολογική κλίμακα εμφανίζει κατάλληλο μήνυμα
 */
public class GradeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please enter a grade: ");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent!");
                break;
            default:
                System.out.println("Grade should be between 1 and 10");
                break;

        }
    }
}
