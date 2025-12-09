package gr.aueb.cf.cf9.ch7;

/**
 * Traverses a string character by character.
 * There is no enhanced for loop. Only classic for loop.
 */
public class StrTraverse {

    public static void main(String[] args) {

        String str = "Coding Factory";

        for (int i = 0; i <str.length(); i++) {

            System.out.print(str.charAt(i) + " ");
        }

        System.out.println();
        // print reversed string

        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i) + " ");
        }

        // to str[i] (όπως στην C) δεν υφίσταται στην Java

        System.out.println();

        //enhanced for with .toCharArray
        for (char c : str.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
