package gr.aueb.cf.cf9.ch7;

public class StrSplit {

    public static void main(String[] args) {

        String s = "Athens University of Economics and Business";

        String[] tokens;

        tokens = s.split( " ");

        for (String token : tokens) {
            System.out.println(token);
        }

        // Υπάρχει και regular expression στην split " +"

        String s1 = "Athens University of      Economics         and Business";

        tokens = s1.split( " +");

        for (String token : tokens) {
            System.out.println(token);
        }

        System.out.println("tokens[3] = " + tokens[3]);

    }
}
