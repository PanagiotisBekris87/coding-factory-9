package gr.aueb.cf.cf9.ch7;

public class LetterCount {

    public static void main(String[] args) {


    }

    public static int getLetterCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

}
