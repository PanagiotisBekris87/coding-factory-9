package gr.aueb.cf.cf9.ch4;

public class CharApp {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = '*';

        System.out.println("ch1:" + ch1);
        System.out.println("ch2:" + ch2);

        System.out.printf("ch1: %c , ordinal: %d\n", ch1, (int) ch1);
        System.out.printf("ch2: %c , ordinal: %d\n", ch2, (int) ch2);
    }
}
