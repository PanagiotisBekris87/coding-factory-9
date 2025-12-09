package gr.aueb.cf.cf9.ch6;

public class XorApp {

    public static void main(String[] args) {

    }

    public static boolean xor (boolean b1, boolean b2) {
        return ( (b1&&!b2) || (!b1&&b2) );
        // Υπάρχει και τελεστής
        // return (b1^b2);
    }
}
