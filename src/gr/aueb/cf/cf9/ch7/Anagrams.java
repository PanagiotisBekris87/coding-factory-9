package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "";
        String s2 = "";
        boolean isAnagram = false;

        System.out.println("Please give two words to check if they are  anagrams: ");
        s1 = scanner.next();
        s2 = scanner.next();

        isAnagram = isAnagram(s1, s2);

        System.out.println("isAnagram ? " + isAnagram);



    }

    public static boolean isAnagram (String s1, String s2) {

        if (s1.length() != s2.length()) return false;
        int[] frequency = new int[256];     // full ascii - default value to zero

        for (char c : s1.toCharArray()) {
            frequency[c]++;
        }

        for (char c : s2.toCharArray()) {
            frequency[c]--;
            if (frequency[c] < 0) return false;         // early exit
        }

        // αν μηδενίσουν όλα θα έχουν τα ίδια γράμματα
        for (int item : frequency) {                    // Αυτό το κομμάτι κώδικα μπορεί και
            if (item != 0) return false;                // να είναι περιττό. Αφού έχουν το ίδιο μήκος (γραμμή 27)
        }                                               // και δεν έγινε ποτέ early exit (γρ. 36)
        return true;                                    // δεν μπορεί να έχουν μείνει "υπόλοιπα" γράμματα στον πίνακα
    }
}
