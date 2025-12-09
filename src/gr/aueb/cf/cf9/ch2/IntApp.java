package gr.aueb.cf.cf9.ch2;
/**
 * Γνωριμία με τα χαρακτηριστικά των: int, byte, short, long
 */
public class IntApp {
    public static void main(String[] args) {
        System.out.printf("Type: int  , Size: %2d bits, Min: %,d, \t\t\t\t Max: %,d\n", Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: byte , Size: %2d bits, Min: %d, \t\t\t\t\t\t\t Max: %d\n", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: short, Size: %2d bits, Min: %,d, \t\t\t\t\t\t Max: %,d\n", Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: long , Size: %2d bits, Min: %,d, \t Max: %,d\n", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
