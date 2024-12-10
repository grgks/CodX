package gr.aueb.cf.ch3;
/*
λαμβανει true / false απο το stdio
για τις δυο δεξαμενες αν ειναι <1/4
Επεξεργαζεται και αναβει πορτοκαλι αν
η μια ειανι < 1/4 και κοκκινο αν και
οι δυο ειναΙ < 1/4.
 */

import java.util.Scanner;

public class TankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEmtpyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;
        System.out.println("Please insert tank status (true/false)");
        System.out.println("tank 1 status:");
        isEmtpyTank1 = scanner.nextBoolean();

        System.out.println("tank 2 status:");
        isEmptyTank2 = scanner.nextBoolean();

        isOrange = isEmtpyTank1 ^ isEmptyTank2;
        isRed = isEmtpyTank1 && isEmptyTank2;
        System.out.println("Orange: " + isOrange +", " +"Red: " +isRed);

    }
}
