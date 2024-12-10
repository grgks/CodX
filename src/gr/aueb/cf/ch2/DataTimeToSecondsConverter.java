package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρεπει ημερες, ωρες, λεπτα, δευτερολεπτα,
 * σε συνολικα δευτερολεπτα.Ο χρηστης δινει τα
 * δεδομενα και εκτυπωνεται το τελικο αποτελεσμα.
 */

public class DataTimeToSecondsConverter {
    public static void main(String[] args) {
        final int SECONS_PER_DAY = 3600 * 24;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONS_PER_MIN = 60;

        Scanner in = new Scanner(System.in);
        int inputDays;
        int inputHours;
        int inputMinutes;
        int inputSeconds;
        int totalSeconds = 0;

        System.out.println("Please insert days, hours, minutes, seconds");
        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSeconds = inputDays * SECONS_PER_DAY + inputHours * SECONDS_PER_HOUR
                + inputMinutes * SECONS_PER_MIN + inputSeconds;

        System.out.printf("Total seconds: %,d sec\n", totalSeconds);


    }
}
