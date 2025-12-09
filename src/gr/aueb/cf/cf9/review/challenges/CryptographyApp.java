package gr.aueb.cf.cf9.review.challenges;

/**
 * Κρυπτογράφηση με μετατροπή των χαρακτήρων σε ακεραίους
 */
public class CryptographyApp {

    public static void main(String[] args) {
        String s = "Coding Factory#";
        final int KEY = 256;
        System.out.println(cipher(s, KEY));
        System.out.println(decipher(cipher(s, KEY), KEY));
    }

    public static String cipher(String s, int key) {
        int prevCipher;
        int cipher;
        StringBuilder cipherArray = new StringBuilder();

        prevCipher = s.charAt(0);
        cipherArray.append(prevCipher);
        cipherArray.append(" ");

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                cipherArray.append("-1");
                break;
            }
            cipher = (s.charAt(i) + prevCipher) % key;
            cipherArray.append(cipher);
            cipherArray.append(" ");
            prevCipher = cipher;
        }
        return cipherArray.toString();
    }

    public static String decipher(String s, int key) {
        StringBuilder decipherArray = new StringBuilder();
        String[] tokens = s.split(" ");
        char decipher;
        int cipher;

        int prevCipher = Integer.parseInt(tokens[0]);
        decipher = (char) prevCipher;
        decipherArray.append(decipher);

        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i].equals("-1")) {
                //decipherArray.append("#");
                break;
            }
            cipher = Integer.parseInt(tokens[i]);
            decipher = (char) ((cipher - prevCipher + key) % key);
            decipherArray.append(decipher);
            prevCipher = cipher;
        }
        return decipherArray.toString();
    }
}
