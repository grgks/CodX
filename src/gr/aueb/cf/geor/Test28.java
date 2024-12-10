package gr.aueb.cf.geor;

import java.math.BigInteger;
import java.util.Scanner;

public class Test28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("Please inserts two ints");
        //a = BigInteger.valueOf(in.nextInt());//
        //b = BigInteger.valueOf(in.nextInt());//

        for ( int i = 1; i <= b.intValue(); i++){
            result = result.multiply(a);
        }
        System.out.printf("Is %d",result);



    }
}
