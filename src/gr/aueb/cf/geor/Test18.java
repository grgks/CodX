package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = 10 ;
        int input = 0;
        boolean bingo = false;

        while (true){
            System.out.println("Please insert number");
            input = sc.nextInt();


            if (input == key){
                System.out.println("Bingo");
                break;
            } else{
                System.out.println("Try again");
            }

        }
    }
}
