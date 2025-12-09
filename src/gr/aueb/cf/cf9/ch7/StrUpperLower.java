package gr.aueb.cf.cf9.ch7;

/**
 * Μετατρέπει σε lowercase / uppercase
 *
 */
public class StrUpperLower {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";

        //equalsIgnoreCase() με Normalization σε uppercase
        boolean isEqual = s1.toLowerCase().equals(s2.toUpperCase());     //true


        // το ίδιο σε lowercase
        boolean isEqual2 = s1.toLowerCase().equals(s2.toLowerCase());

    }
}
