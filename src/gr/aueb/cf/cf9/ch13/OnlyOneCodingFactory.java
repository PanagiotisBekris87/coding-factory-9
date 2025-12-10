package gr.aueb.cf.cf9.ch13;

/**
 * Singleton Design Pattern.
 * Επιτρέπει να υπάρχει μόνο ένα instance
 */
public class OnlyOneCodingFactory {

    // Eager Initialization - The instance is created when the class is loaded.
    private final static OnlyOneCodingFactory instance = new OnlyOneCodingFactory();

    private OnlyOneCodingFactory() {}

    public static OnlyOneCodingFactory getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("I am doing something");
    }
}
