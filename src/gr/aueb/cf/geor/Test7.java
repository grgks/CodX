package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        int inputTemp = 0;


        System.out.println("please insert temparature (F)");
        inputTemp = in.nextInt();

      temp = 5 * (inputTemp-32) / 9 ;
        System.out.printf("H %d F is  %d C", inputTemp , temp);
    }
}
