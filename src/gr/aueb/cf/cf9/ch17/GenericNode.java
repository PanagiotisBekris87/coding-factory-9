package gr.aueb.cf.cf9.ch17;

/**
 * Πρόσεξε το Τ στην επικεφαλίδα
 */
public class GenericNode<T> {

    private T value;

    public GenericNode() {
    }

    public GenericNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
