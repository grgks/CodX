package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβανει ως input απο τον χρηστη ενα
 * διψηφιο ακεραιο και υπολογιζει και εκτυπωνει
 * το αθροισμα των ψηφιων του.
 * Για παραδειγμα αν ο χρηστης δωσει τον
 * ακεραιο 15 θα πρεπει το αποτελεσμα να ειναι
 * 1 + 5 = 6.
 */

public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNum;
        int sum =0 ;

        System.out.println("Please insert a two-digit integer");
        inputNum = in.nextInt();

        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        sum = leftDigit + rightDigit;

        System.out.printf("Input num: %d , Left digit: %d, Right digit: %d, Sum: %d",inputNum, leftDigit, rightDigit, sum);


    }
}
