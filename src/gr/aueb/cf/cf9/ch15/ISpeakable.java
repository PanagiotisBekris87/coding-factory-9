package gr.aueb.cf.cf9.ch15;

/**
 * Functional Interface - Μόνο μία μέθοδος
 */
@FunctionalInterface
// το μαρκάρουμε με το από πάνω @ για να μην πάει κάποιος και το αλλάξει
public interface ISpeakable {
    /**
     * Makes a sound like a speech.
     */
    public abstract void speak();       // Όπως βλέπουμε το public abstract είναι γκρι
                                        // Οπότε και να μην το γράψουμε δίνεται by default
}
