package gr.aueb.cf.ch2;

import java.util.Scanner;

/** convert miles to km.
 *
 */
public class MilesToKm {
    public static void main(String[] args) {
        final  double KM_PER_MILE = 1.6;
        double inputMiles = 0.0;
        double kilometres = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert miles");
        inputMiles = sc.nextDouble();
        kilometres = inputMiles * KM_PER_MILE;
        System.out.println("Miles: " + inputMiles + ", km:" + kilometres);

    }
}
