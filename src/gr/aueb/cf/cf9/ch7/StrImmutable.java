package gr.aueb.cf.cf9.ch7;

/**
 * Strings are cached in SCP (String constant Pool)
 * or Intern ARea for efficiency.
 * In order to be secure strings are Immutable.
 */
public class StrImmutable {

    public static void main(String[] args) {

        String str1 = "Coding";
        String str2 = "Coding";

        str2 = "Factory";

        System.out.println(str1);
        System.out.println(str2);
    }

}
