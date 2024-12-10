package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπαρχει ενας μυστικος αριθμος
 * και ο χρηστης προσπαθει με μια μονο
 * προσπαθεια να τον βρει.
 */

public class SecretFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        System.out.println("Insert a num to guess the secret");
        num = scanner.nextInt();
        if (num == SECRET) {
            System.out.println("Secret found!!!");
        } else {    // num != SECRET
            System.out.println("Failure!!");
        }
    }
}
