package gr.aueb.cf.geor;

import java.util.Scanner;

/**Μετατρεπει ημερες, ωρες, λεπτα, δευτερολεπτα,
 * σε συνολικα δευτερολεπτα.Ο χρηστης δινει τα
 * δεδομενα και εκτυπωνεται το τελικο αποτελεσμα.
 */

public class Seconds {
    public static void main(String[] args) {
        final int SecondsPerDay = 3600 * 24;
        final int SecondsPerHour = 60 * 60;
        final  int SecondsPerMinute = 60;

        Scanner in = new Scanner(System.in);

        int inputDays;
        int inputHours;
        int inputMin;
        int inputSec;
        int totalSecs = 0 ;

        System.out.println("please insert days ,hours, minutes, seconds ");
        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMin = in.nextInt();
        inputSec = in.nextInt();

        totalSecs = inputDays * SecondsPerDay + inputHours * SecondsPerHour + inputMin * SecondsPerMinute
        + inputSec;

        System.out.printf("total secs = %,d secs ", totalSecs);



    }
}
