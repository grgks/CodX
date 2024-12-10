package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTempBelowZero = true;
        int input = 0;

        System.out.println("Please insert temparature");
        input = sc.nextInt();

        isTempBelowZero = input < 0 ;




       System.out.printf("Is below zero :" + isTempBelowZero);
    }
}
