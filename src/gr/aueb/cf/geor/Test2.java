package gr.aueb.cf.geor;

import java.math.BigInteger;

/* Big Integer

 */
public class Test2 {
    public static void main(String[] args) {


        BigInteger bigNum1 = new BigInteger("222345678");
        BigInteger bigNum2 = new BigInteger("222345678");


        BigInteger result = bigNum1.add(bigNum2);

        System.out.printf("%,d",result);

    }



}
