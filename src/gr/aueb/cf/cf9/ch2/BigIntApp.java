package gr.aueb.cf.cf9.ch2;

import java.math.BigInteger;

/**
 * Big Integer Class Demo
 */
public class BigIntApp {

    public static void main(String[] args) {

        BigInteger bigNum1 = new BigInteger("4564561325496544564164542497641646144897913795498432168746165687497987987978978945678912546468");
        BigInteger bigNum2 = new BigInteger("4454845613236654431676431257955477896555555321313555555555555641387943214467631468768435167688");
        BigInteger bigResult;

        bigResult = bigNum1.multiply(bigNum2);

        System.out.printf("The result is: %,d\n", bigResult);
    }
}
