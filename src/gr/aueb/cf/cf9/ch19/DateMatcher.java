package gr.aueb.cf.cf9.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The input string includes dates in the US format mm/dd/yyyy.
 * The program recognizes all the dates in the string and transforms to gr dates.
 */
public class DateMatcher {

    public static void main(String[] args) {
        String date = "06/25/2024 asdqwe? 11/17/1999 ert';\\'; *-*-*-09/27/1987";

        // θέλουμε να αναζητήσουμε και να βρούμε τις εμφανίσεις του pattern της ημερομηνίας

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");        // βάζω () για να φτιάξω groups
        Matcher matcher = pattern.matcher(date);

        while (matcher.find()) {

            System.out.println(matcher.group());

            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

            String grDate = String.format("%s/%s/%s", day, month, year);
//            String grDate = day + "/" + month + "/" + year;

            System.out.println(grDate);
            System.out.println();
        }
    }
}
