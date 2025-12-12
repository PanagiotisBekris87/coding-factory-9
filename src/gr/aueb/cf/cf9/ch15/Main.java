package gr.aueb.cf.cf9.ch15;

public class Main {
    public static void main(String[] args) {

        ISpeakable cat = new Cat("Danai");
        ISpeakable dog = new Dog("Jackie", 16);

        dospeak(cat);
        dospeak(dog);
    }

    public static void dospeak(ISpeakable iSpeakable) {
        iSpeakable.speak();
    }
}
