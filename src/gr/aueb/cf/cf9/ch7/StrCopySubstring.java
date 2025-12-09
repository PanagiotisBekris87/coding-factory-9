package gr.aueb.cf.cf9.ch7;

/**
 * Αντιγραφή Strings γίνεται με αντιγραφή δεικτών
 * γιατί τα Strings είναι immutable.
 */
public class StrCopySubstring {

    public static void main(String[] args) {

        // Copy
        String s1 = "Coding";
        String s2 = s1;         // Copy

        s2 = "Factory";

        System.out.println(s1);
        System.out.println(s2);

        //Substrings
        String s3 = s1.substring(0);        // redundant
        System.out.println("s3 = " + s3);
        String s4 = s1.substring(1);        // oding
        System.out.println("s4 = " + s4);
        String s5 = s1.substring(1,3);                // od
        System.out.println("s5 = " + s5);

        // traverse char-by-char με substring

        for (int  i = 0; i < s1.length(); i++) {

            System.out.print(s1.substring(i, i + 1) + " ");
        }

    }
}
