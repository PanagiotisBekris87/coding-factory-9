package gr.aueb.cf.cf9.ch19;

public class RegEx {

    public static void main(String[] args) {

        String s = "hello";
        String possibleDate = "11/11/1111";
        System.out.println(isHelloOrHi(s));
        System.out.println(isHhello(s));
        System.out.println(isDate(possibleDate));
    }



    public static boolean isHello(String s) {
        return s.matches("Hello");
        // εδώ δουλεύει 100% σαν την equals
    }

    public static boolean isHelloOrHi(String s) {
        return s.matches("Hello|Hi");

    }

    public static boolean isHhello(String s) {
        return s.matches("[Hh]ello");
    }


    /**
     * Ξεκινάει με uppercase και ακολουθείται από τη λέξη coding
     * @param s
     * @return
     */
    public static boolean startsWithUppercase(String s) {
        return s.matches("[A-Z]coding");
    }

    public static boolean startsWithUpperOrLowercase(String s) {
        return s.matches("[A-Za-z]coding");
    }

    public static boolean startsWithLetter(String s) {
        return s.matches("[A-Za-z0-9_]coding");
    }
    // όλα αυτά μέχρι εδώ είναι verbose

    // Γι'αυτό δημιουργήθηκαν οι μεταχαρακτήρες

    public static boolean anyCharAndDigit(String s) {
        return s.matches(".\\d");   // .[0-9]
        // η τελεία από μόνη της σημαίνει οποιοσδήποτε χαρακτήρας εκτός από την αλλαγή γραμμής
    }

    public static boolean dotAndDigit(String s) {
        return s.matches("\\.\\d");     //   "\\. σημαίνει μόνο τελεία"
    }


    // recognize date χχ/χχ/χχχχ
    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static boolean twoWords(String s) {
        return s.matches(".*\\s+.*");
    }

    // αν s = Hello world επιστρέφει world Hello
    public static String reverse(String s) {
        return s.replaceAll("(.+)\\s(.+)", "$2 $1" );   // backreference - groups
    }
}
