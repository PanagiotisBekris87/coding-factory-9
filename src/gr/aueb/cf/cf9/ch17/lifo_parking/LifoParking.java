package gr.aueb.cf.cf9.ch17.lifo_parking;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LifoParking {

    private final Deque<String> parking = new LinkedList<>();

    public LifoParking() {
    }

    public List<String> getParking() {
//        return Collections.unmodifiableList(parking);
        return List.copyOf(parking);        // Επιστρέφει unmodifiable list
    }

    // Delegation - δεν υλοποιώ εγώ την add. Καλώ υπηρεσία της linked List
    public void addCar (String car) {
        parking.push(car);      // πάντα στο top προσθέτει
        System.out.println(LocalDateTime.now() + ": " + ", Είσοδος, Αρ. Πινακίδας = " + car);
    }

    public String removeCar() {
        String car = parking.pop();
        System.out.println(LocalDateTime.now() + ": " + ", Έξοδος, Αρ. Πινακίδας = " + car);
        return car;
    }

    boolean isEmpty(){
        return parking.isEmpty();
    }

    public void traverse() {
        parking.forEach(System.out::println);
    }
}
