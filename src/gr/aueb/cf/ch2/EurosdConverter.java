package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβαζει απο τον χρηστη ενα ποσο σε ευρω
 * και το μετατρεπει σε USD και cents.
 * Η ισοτιμια ειναι 99 cents = 1 ευρω.Εκτυπωνει
 * το αποτελεσμα.
 */
public class EurosdConverter {
    public static void main(String[] args) {
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("please insert an integer ammount (Euro)");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;
        System.out.printf("%d euros = %d usa dollars,%d usa cents ", inputEuros, usaDollars, usaCents);
    }
}
