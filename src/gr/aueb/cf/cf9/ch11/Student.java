package gr.aueb.cf.cf9.ch11;

/**
 * Java Bean.
 * Data class που έχει
 *  - private πεδία
 *  - τουλάχιστον έναν default constructor
 *  - getters & setters με συμβάσεις
 *
 *  Στο παρόν παράδειγμα έχουμε εισάγει και
 *  static για εκπαιδευτικούς λόγους. Κανονικά
 *  τα java beans δεν έχουν μέσα static μεταβλητές.
 */
public class Student {

    private static int studentsCount = 0;

    // static block
//    static {
//        studentsCount = () ? : ;      Μπορούμε να αρχικοποιούμε έτσι για κάποια συνθήκη
//    }

    private int id;                     // όχι public, δεν θα είχαμε encapsulation
    private String firstname;
    private String lastname;

    // Default Constructor
    public Student() {
        studentsCount++;

    }                                       // αν δηλώσουμε και τον overloaded

    // Overloaded constructor
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    // Public Getters και Setters
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static int getStudentsCount() {
        return studentsCount;
        // id       Δεν γίνεται static να καλέσει non static
    }

}
