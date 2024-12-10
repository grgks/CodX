package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        final int Running= 100;
        int inputSpeed = 0;
        boolean openLights = false;
        boolean isRunning = false;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = sc.nextBoolean();
        System.out.println("Please insert if it is dark (true/false");
        isDark = sc.nextBoolean();
        System.out.println("please insert the km/h");
        inputSpeed = sc.nextInt();


        isRunning = inputSpeed > Running;
        openLights = isRaining && (isDark || isRunning) ;

        System.out.printf("Open lights: " + openLights);



    }
}
