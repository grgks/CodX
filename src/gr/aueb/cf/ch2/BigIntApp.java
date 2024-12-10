package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * big integer class demo
 */

public class BigIntApp {
    public static void main(String[] args) {
        //diloseis
        BigInteger bigNum1 = new BigInteger("123456789987654321");
        BigInteger bigNum2 = new BigInteger("2345678875654323");
        BigInteger result;

        //entoles

        result = bigNum1.add(bigNum2);

        //print result
        System.out.printf("%, d", result);
    }
}
