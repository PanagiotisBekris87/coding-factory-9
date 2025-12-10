package gr.aueb.cf.cf9.ch13;

/**
 * Lazy Initialization
 */
public class OnlyOneCodingLazy {
    private static OnlyOneCodingLazy instance; // = null

    private OnlyOneCodingLazy() {}

    public static OnlyOneCodingLazy getInstance() {
        if (instance == null) {
            instance = new OnlyOneCodingLazy();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("I am doing something");
    }
}