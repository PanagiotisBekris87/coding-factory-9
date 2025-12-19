package gr.aueb.cf.cf9.ch17;

import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {

        String[] cities = {"Athens", "Berlin", "Paris"};

        Integer[] numbers = {1, 2, 3, 4, 5, 6};

        printArray(cities);
        printArray(numbers);
    }

    public static <T> void printArray(T[] array) {

        for(T element : array) {
            System.out.println(element);
        }
    }

    // Αν δεν έχουμε καμία εξάρτηση από τον παραμετρικό τύπο
    public static void print(GenericNode<?> node) {
        System.out.println(node.getValue());    // δουλεύει όπως και να χει
    }

    // δουλεύει για οποιονδήποτε τύπο αριθμών
    public static void printNumbers(GenericNode<? extends Number> node) {
        System.out.println(node.getValue());
    }

    // είναι σαν κάτω όριο.
    // δουλεύει για οτιδήποτε είναι integer ή number ή object
    public static void printNumbers2(GenericNode<? super Integer> node) {
        System.out.println(node.getValue());
    }



    private static <T> void produceConsume(List<? super T> list, Iterable<? extends T> src) {
        for (T item : src) {
            list.add(item);
        }
    }

}


