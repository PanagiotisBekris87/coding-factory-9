package gr.aueb.cf.cf9.ch11;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();

//        alice.id = 1;                         // αντικαθίστανται από setters όταν κάνουμε τις μεταβλητές
//        bob.id = 2;                           // private (encapsulation)
//        student.firstname = "George";

        User andreas = new User(1, "Andreas", "Andreou", "andrew22", "12345", true);

        Product milk = new Product(1, "milk", "Cow milk 10%", 1.99, 50, true);

        Customer customer = new Customer();


        alice.setId(1);                                 //setter
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        bob.setId(2);
        bob.setFirstname("Bob");
        bob.setLastname("Dylan");

        student.setId(3);
        student.setFirstname("Anna");
        student.setLastname("Karenina");

        System.out.println(alice.getId());              //getter
        System.out.println(alice.getFirstname());
        System.out.println(alice.getLastname());

        System.out.printf("Id: %d, Firstname: %s, Lastname: %s\n",
                alice.getId(), alice.getFirstname(), alice.getLastname());

        // Χρήση overloaded constructor
        Student student2 = new Student(4, "Makis", "Kapetis");
        // και μπορούμε φυσικά να αλλάξουμε με setters
        student2.setFirstname("Xrisostomos");

        System.out.println(Student.getStudentsCount());     // Τις static τις καλούμε με το πλήρες όνομα.
                                                            // Σκέψου οτι ανήκουν στην κλάση
    }
}
