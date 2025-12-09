package gr.aueb.cf.cf9.review.mid_level;

public class StringConCat {

    public static void main(String[] args) {
        String name = "Alice";
        int age = 40;
        String message = message(name, age);
        System.out.println(message);
    }

    public static String message(String name, int age) {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
}
