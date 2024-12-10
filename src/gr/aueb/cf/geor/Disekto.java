package gr.aueb.cf.geor;

import java.util.Scanner;

/*

 */
public class Disekto {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int InputYear = 0;
        boolean Disekto;


        System.out.println("Parakalw eisagete etos");
        InputYear = in.nextInt();

        Disekto = (InputYear % 400 == 0) || (InputYear % 4 == 0) && (InputYear % 100 != 0);

        System.out.printf("Einai: " + Disekto);

    }
}