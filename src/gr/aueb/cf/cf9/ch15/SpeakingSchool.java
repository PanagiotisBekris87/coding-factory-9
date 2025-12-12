package gr.aueb.cf.cf9.ch15;

public class SpeakingSchool {

    // tightly coupled (Πρόβλημα) - Δεν είναι αρκετά γενικό/flexible
    private final Cat cat = new Cat();          // composition, private instance
    // final είναι ο δείκτης , όχι το περιεχόμενο του instance
    // Για να μην μπορεί κάποιος να "δείξει" σε άλλη διεύθυνση στη μνήμη

    public SpeakingSchool() {

    }

    public void learnToSpeak() {
        cat.speak();
    }
}
