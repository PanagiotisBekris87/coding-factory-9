package gr.aueb.cf.cf9.ch14;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(15.8);
        Point2D p2 = new Point2D(2, 5.5);
        Point3D p3 = new Point3D(2, 5.5, 10);



        p1.movePlusOne();
        p2.movePlus10();
        p3.movePlusOne();

        // Μήπως υπάρχει ένας πιο ομοιόμορφος τρόπος να καλούμε όλες αυτές τις μεθόδους?
        // Σκέψου ότι και η Point2D και η Point3D κληρονομούν από την Point, άρα ΕΙΝΑΙ Point

        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);

        // Επίσης πολυμορφισμός είναι και το παρακάτω αφού όλα είναι point
        // Πολυμορφισμός υπο-τύπων
        Point p4 = new Point(18.8);
        Point p5 = new Point2D(3, 6.6);
        Point p6 = new Point3D(7, 8.8, 4);

        // Ακόμα και αν δεν τη γράψω την toString Καλείται αυτόματα από την println
        // αυτό γινόταν πάντα μέχρι τώρα
        // και ξέρει ποιά toString να καλέσει τώρα που τη φτιάξαμε στο Point (καλεί την κατάλληλη)
        System.out.println("p1 = " + p1.toString());
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);

        // Παρακάτω έχω ομοιομορφία και πολυμορφισμό
        doPrint(p1);
        doPrint(p2);
        doPrint(p3);
    }


    public static void doMovePlus10 (Point p) {
        p.movePlus10();         //Θα κληθεί κάθε φορά η κατάλληλη μέθοδος ανάλογα με το Point ή Point2D ή Point3D
    }                           //late binding

            // Αυτό είναι ο πολυμορφισμός!!!

    // και αυτή είναι πολυμορφική μέθοδος
    // γιατί υπονοείται η κατάλληλη toString
    // System.out.println(p.toString);
    public static void doPrint (Point p) {
        System.out.println(p);
    }



}
