package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please give two numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        min = (num1 > num2) ? num1 : num2 ;

        System.out.printf("The min of Num1 : %d and Num2 : %d is %d",num1 , num2 , min);
    }
}