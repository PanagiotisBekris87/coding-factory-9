package gr.aueb.cf.cf9.ch16.copy_constructor;

public class Main {


    public static void main(String[] args) {

        // Φτιάχνω ένα city να αναθέσω στον 1ο Student που θα φτιάξω
        City athina = new City("athens");

        // Φτιάχνω student Bob
        Student bob = new Student("Bob", athina);

        // Αντιγράφω τον bob σε έναν νέο student που ονομάζεται robert
        // ΠΡΟΣΟΧΗ: Αφού είναι αντιγραφή ΤΟ ΟΝΟΜΑ ΤΟΥ ROBERT ΘΑ ΕΙΝΑΙ BOB
        Student robert = new Student(bob);

        // Παίρνω την πόλη του ROBERT.
        City hazard = robert.getCity();

        // και της αλλάζω DESCRIPTION
        // το πιθανό SECURITY LEAK που είπε ο Ανδρούτσος
        // Προσομοίωση κακόβουλης προσπάθειας αλλαγής του instance state
        hazard.setDescription("lamia");

        // Εκτυπώνω τα STATE των Bob και Robert
        System.out.println(bob);
        System.out.println(robert);
    }
}
