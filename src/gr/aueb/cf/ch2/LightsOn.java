package gr.aueb.cf.ch2;

import java.util.Scanner;

public class LightsOn {
    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        Scanner in = new Scanner(System.in);
        boolean isDark = false;
        boolean isCarRunning = false;
        boolean isRaining = false;
        boolean areLightsOn = false;
        int carSpeed;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed");
        carSpeed = in.nextInt();

        isCarRunning = carSpeed > MAX_CAR_SPEED;
        areLightsOn = isRaining && (isDark || isCarRunning);


        // areLightsOn = (isRaining && isDark) || (isRaining && isCarRunning);
        System.out.println("Turn lights on: " + areLightsOn);
    }

}
