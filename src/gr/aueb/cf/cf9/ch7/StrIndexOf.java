package gr.aueb.cf.cf9.ch7;

public class StrIndexOf {

    public static void main(String[] args) {

        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");                               //1
        System.out.println("positionOfo = " + positionOfo);

        int positionOfNexto = cf.indexOf("o" , 2);          //11
        // ψάχνει να βρει από την θέση 2 και μετά
        System.out.println("positionOfNexto = " + positionOfNexto);

        int positionOfLasto =cf.lastIndexOf("o");                   //11
        System.out.println("positionOfLasto = " + positionOfLasto);

    }


    // Μέθοδος που επιστρέφει την κατάληξη του ονόματος ενός αρχείου
    // π.χ. coding.txt
    public static String getExtension (String filename) {
        return filename.substring(filename.lastIndexOf(".") + 1);
        // Βάζουμε +1 για να μην μας επιστρέψει και την τελεία
    }
}
