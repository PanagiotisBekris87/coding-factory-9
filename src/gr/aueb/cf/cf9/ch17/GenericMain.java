package gr.aueb.cf.cf9.ch17;

public class GenericMain {

    public static void main(String[] args) {

        GenericNode<String> strNode = new GenericNode<>();
        GenericNode<Double> doubNode = new GenericNode<>();        // Όχι primitive ως παραμετρικοί τύποι. Βάζουμε wrapper κλάσεις.
        // Ισοδυναμεί με:
        var intNode = new GenericNode<Integer>();



        doubNode.setValue(10.5);
        strNode.setValue("Hello");

    }




}
