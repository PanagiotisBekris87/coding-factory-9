package gr.aueb.cf.cf9.ch8;

/**
 * Null pointer Exception
 */
public class NPEApp {

    public static void main(String[] args) {

        String s;

        s = getOneOrNull();
        if (s == null) {
            System.out.println("s is null");
            return;                             // σταματάμε / κλείνουμε εμείς το πρόγραμμα
        }
        System.out.println(s.length());

    }

    public static String getOneOrNull() {
        return null;
    }
}
