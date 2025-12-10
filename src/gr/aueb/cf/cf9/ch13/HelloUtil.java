package gr.aueb.cf.cf9.ch13;

/**
 * Utility classes are non-instantiable.
 * They provide public static methods only.
 */
public class HelloUtil {

    /**
     * No instances of this class should be available.
     * Γι'αυτό προσέχουμε να κάνουμε PRIVATE τον default
     * constructor. Αν τον αφήσουμε και δεν τον δηλώσουμε
     * ρητά ως private η Java θα μας δώσει έναν public
     * default.
     */

    private HelloUtil() {}

    public static void sayHello() {
        System.out.println("Hello Coding!!");
    }

}
