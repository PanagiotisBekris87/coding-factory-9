package gr.aueb.cf.cf9.ch15;

/**
 * Loosely Coupled
 */
public class GenericSpeakingSchool {

    // Τώρα είναι πιο flexible μπορεί να δουλέψει με οτιδήποτε κάνει implement το Interface

    private final ISpeakable iSpeakable;        // Χρήση Interfaces

    // Dependency Injection
    // IoC - Inversion of control (Κάποιος άλλος κάνει "new" και το στέλνει εδώ)
    public GenericSpeakingSchool(ISpeakable iSpeakable) {
        this.iSpeakable = iSpeakable;
    }

    public  void speak() {
        iSpeakable.speak();
    }
}
