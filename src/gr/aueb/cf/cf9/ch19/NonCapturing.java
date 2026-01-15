package gr.aueb.cf.cf9.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Recognize but not capture
 */
public class NonCapturing {


    public static void main(String[] args) {


        String s = "HelloWorld HelloWorld";

        Pattern pattern = Pattern.compile("(Hello)(?:World)");      // Το ?: δεν το τοποθετεί μέσα στα groups του matcher

        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
//            System.out.println(matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.print(matcher.group(i) + " ");
            }
            System.out.println();
        }

    }
}
