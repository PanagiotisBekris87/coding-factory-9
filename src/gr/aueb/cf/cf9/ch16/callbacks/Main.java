package gr.aueb.cf.cf9.ch16.callbacks;

public class Main {

    public static void main(String[] args) {

        // Κάνω new μία Ανώνυμη κλάση που υλοποιεί το Printable Interface
        // Είναι legacy τρόπος, δεν χρησιμοποιείται πια στην πράξη
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        };


        // Lambda που υλοποιεί την print από το interface. - Lambda expression
        Printable printable2 = () -> System.out.println("Hello World!");
        Printable printable3 = () -> doPrint();

        // Method reference
        Printable printable4 = Main::doPrint;


        doWithPrintable(printable);
        doWithPrintable(printable2);
        doWithPrintable(printable3);
        doWithPrintable(printable4);

        System.out.println("------------------------- ANONYMOUS CLASSES");

        doWithPrintable(new Printable() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        });

        System.out.println("------------------------- LAMBDA EXPRESSIONS");

        doWithPrintable(() -> System.out.println("Hello World!"));

        System.out.println("------------------------- METHOD REFERENCES");

        doWithPrintable(Main::doPrint);
        doWithPrintable(System.out::println);

    }

    public static void doPrint() {
        System.out.println("Hello World!");
    }

    public static void doWithPrintable(Printable printable) {
        printable.print();
    }
}
