package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean isOrange = false;
        boolean isRed = false;
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;

        System.out.println("Please inset if Tank1 is orange (true/false)");
        isEmptyTank1 = sc.nextBoolean();
        System.out.println("Please insert if Tank2 is orange (true/false)");
        isEmptyTank2 = sc.nextBoolean();

        isOrange = isEmptyTank1 ^ isEmptyTank2;
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.printf("Is red : " + isRed, "is orange : " + isOrange);



    }
}
