package gr.aueb.cf.cf9.review.mid_level;

public class EvenApp {

    public static void main(String[] args) {

        int num = 11;
        boolean result = even(num);

        System.out.println("The number is even? " + result);
    }

    public static boolean even(int num) {
        return num % 2 == 0;
    }
}
