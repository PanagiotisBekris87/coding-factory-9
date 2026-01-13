package gr.aueb.cf.cf9.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

    public static void main(String[] args) {

        String s = "C0d1ngF@ct0ry";      // τουλάχιστον 8 χαρακτήρες, τουλάχιστον 1 lower case

        // τουλάχιστον 12 χαρακτήρες τουλάχιστον 1 lower case
        // 1 uppercase 1 digit 1 special character
        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*])^.{12,}$");      // zero-length assertion;
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
