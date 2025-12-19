package gr.aueb.cf.cf9.ch17.doubly_linked_list;

public class DoublyLinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;

    public void insertFirst(T t) {

        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        if (isEmpty()) {
            tail = tmp;
        } else {
            head.setPrev(tmp);
        }
        head = tmp;
    }


    /**
     * Time complexity O(1)
     * @param t
     */
    public void insertLast(T t) {
        if (isEmpty()) {
            insertFirst(t);
            return;
        }

        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail.setNext(tmp);
        tail = tmp;
    }

    /**
     * Time complexity O(1)
     * @param t
     */
    public Node<T> removeFirst() {
        if (isEmpty()) return null;

        Node<T> nodeToReturn = head;

        if (head.getNext() == null) tail = null;
        head = head.getNext();
        if (head != null) head.setPrev(null);

        return nodeToReturn;
    }


//    public Node<T> removeFirstAlternative() {
//        if (isEmpty()) return null;
//
//        Node<T> nodeToReturn = head;
//
//        if (head == tail) {
//            head = null;        // Η λίστα είναι πλέον άδεια
//            tail = null;
//        } else {
//            head = head.getNext();
//            head.setPrev(null);
//        }
//        return nodeToReturn;
//    }

    /**
     * Time complexity O(1)
     * @param t
     */
    public Node<T> removeLast() {
        if (isEmpty() || head.getNext() == null) {
            return removeFirst();
        }

        Node<T> nodeToReturn = tail;
        tail = tail.getPrev();
        tail.setNext(null);
        return nodeToReturn;
    }


    public Node<T> get(T t) {
        Node<T> nodeToReturn = null;

        for (Node<T> n = head; n != null; n = n.getNext()) {
            if(n.getNext().equals(t)) {     // equals must be overriden in class T
                nodeToReturn = n;
                break;
            }
        }
        return nodeToReturn;
    }


    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getItem());
        }
    }

    public void traverseReverse() {
        for (Node<T> n = tail; n != null; n = n.getPrev()) {
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
