package gr.aueb.cf.geor;

import java.util.Scanner;

public class UsdEuroConverter {
    public static void main(String[] args) {
        int inputEuros = 0 ;
        int totalUsaCents = 0;
        int UsaDollars = 0;
        int UsaCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("Παρακαλω εισαγετε ακεραιο ποσο σε ευρω");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * PARITY;
        UsaDollars = totalUsaCents / 100;
        UsaCents = totalUsaCents % 100;

        System.out.printf("%d euros = , %d usa dollars, %d usa cents ",inputEuros, UsaDollars,UsaCents);
    }
}
