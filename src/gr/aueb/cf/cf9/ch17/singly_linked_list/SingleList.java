package gr.aueb.cf.cf9.ch17.singly_linked_list;

/**
 *
 * Υλοποίηση τρόπου λειτουργίας των λιστών για έναν οποιοδήποτε
 * τύπο Τ. (Node<T>)
 */
public class SingleList<T> {

    // Αρχικά η λίστα είναι κενή - Το head δείχνει στο Null
    private Node<T> head = null;

    //Υπονοείται ότι υπάρχει και default constructor για τη δημιουργία μίας λίστας

    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
        head = tmp;
    }

    /**
     * Time-complexity O(n)
     * @param t
     */
    public void insertLast(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);

        if (isEmpty()) {
            insertFirst(t);
            return;
        }

        Node<T> n;
        for (n = head; n.getNext() != null; n = n.getNext());       // απλά προχωράμε μέχρι να φτάσουμε στον τελευταίο κόμβο
                                                                    // Ειδική μορφή της for, δεν έχει σώμα.

        n.setNext(tmp);
    }

    public Node<T> removeFirst() {
        if (isEmpty()) return null;
        Node<T> tmp = head;
        head = head.getNext();
        return tmp;
    }

    public Node<T> removeLast() {

        // if list is empty of has only one element
        if (isEmpty() || head.getNext() == null) {
            return removeFirst();
        }

        Node<T> n;
        for (n = head; n.getNext().getNext() != null; n.getNext());     // θέλουμε να φτάσουμε μέχρι τον προ-τελευταίο

        Node<T> nodeToReturn = n.getNext();             // να κρατήσουμε τον επόμενο
        n.setNext(null);                                // και μετά να θέσουμε τον επόμενο null
        return nodeToReturn;
    }

    // Πράξη αναζήτησης
    public Node<T> get(T t) {
        Node<T> nodeToReturn = null;

        for (Node<T> n = head; n != null; n = n.getNext()) {

            if (n.getItem().equals(t)) {
                nodeToReturn = n;
                break;
            }
        }
        return nodeToReturn;
    }

    // traverse της λίστας
    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getItem());
        }
    }

    public int size() {
        int counter = 0;
        for (Node<T> n = head; n != null; n = n.getNext()) {
            counter++;
        }
        return counter;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
