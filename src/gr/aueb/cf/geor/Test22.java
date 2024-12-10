package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please give two numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 < num2){
            min = num1;
        }else min = num2;
           System.out.printf("The min value of A : %d  and B : %d is %d " , num1 , num2 , min);
        System.out.println();


        //System.out.printf("The min value of %d and %d is %d" ,num1 , num2 , min);//

    }
}
