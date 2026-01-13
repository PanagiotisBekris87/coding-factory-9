package gr.aueb.cf.cf9.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LowerCaseAssert {

    public static void main(String[] args) {

        String s = "ASDADSADSDa";      // τουλάχιστον 8 χαρακτήρες, τουλάχιστον 1 lower case

        Pattern pattern = Pattern.compile("(?=.*?[a-z])^.{8,}$");      // zero-length assertion;
        // to ^ σημαίνει αρχή String και το $ τέλος String
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
