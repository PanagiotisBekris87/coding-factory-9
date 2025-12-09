package gr.aueb.cf.cf9.ch7;

public class StrEqualCompareTo {

    public static void main(String[] args) {

        String str1 = "Athens";
        String str2 = "athens";
        String str3 = "ATHENS";
        String str4 = new String("Athens");
        String str5 = "Athens";



        // Equals
        boolean equals1 = str1 == str2;     // false
        boolean equals2 = str1 == str4;     // false
        boolean equals3 = str1 == str5;     // true SCP


        boolean equals4 = str1.equals(str2);        // false
        boolean equals5 = str1.equals(str4);        // true
        boolean equals6 = str1.equals(str5);        // true

        boolean equals7 = str1.equalsIgnoreCase(str2);        // true

        // Compare
        if (str1.compareTo(str2) > 0) {
            System.out.println("str1 > str2");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("str1 < str2");
        } else {    // str1.compareTo(str2) == 0
            System.out.println("str1 == str2");
        }

        if (str1.compareToIgnoreCase(str2) > 0) {
            System.out.println("str1 > str2");
        } else if (str1.compareToIgnoreCase(str2) < 0) {
            System.out.println("str1 < str2");
        } else {    // str1.compareToIgnoreCase(str2) == 0
            System.out.println("str1 == str2");
        }



    }
}
