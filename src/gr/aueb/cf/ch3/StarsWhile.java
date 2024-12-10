package gr.aueb.cf.ch3;

import java.util.Scanner;

/** print 10 horizontal stars
 * */


public class StarsWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int n = 0;
        int j = 1;

        System.out.println("Eisagete n");
        n = scanner.nextInt();

        while (n >= 1   ) {
         System.out.printf("*");
         n--; j++;
        }
    }
}
