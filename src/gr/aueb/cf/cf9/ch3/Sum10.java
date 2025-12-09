package gr.aueb.cf.cf9.ch3;

/**
 * Sum of 10 numbers, from 1 to 10
 */
public class Sum10 {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        int mul = 1;

        while (i <= 10){
            sum += i;
            mul *= i;
            i++;
        }
        System.out.println("Sum of numbers 1-10 is: " + sum);
        System.out.println("10 factorial is: " + mul);
    }
}
