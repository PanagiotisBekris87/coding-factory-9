package gr.aueb.cf.cf9.ch16.copy_constructor;

public class Main {


    public static void main(String[] args) {


        City athina = new City("athens");

        Student bob = new Student("Bob", athina);

        Student robert = new Student(bob);

        City hazard = robert.getCity();

        hazard.setDescription("lamia");


        System.out.println(bob);
        System.out.println(robert);

        System.out.println();

        robert.setCity(hazard);
        System.out.println(robert);
    }
}
