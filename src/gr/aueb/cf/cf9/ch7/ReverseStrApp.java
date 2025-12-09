package gr.aueb.cf.cf9.ch7;

public class ReverseStrApp {

    public static void main(String[] args) {

        String str = "Unicorn";

        System.out.println("str = " + str);

        str = reverse(str);

        System.out.println("str = " + str);

        str = reversed2(str);


        System.out.println("str = " + str);
    }

    public static String reverse(String str) {

        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public static String reversed2(String str) {
        return new StringBuilder(str).reverse().toString();
    }


}
