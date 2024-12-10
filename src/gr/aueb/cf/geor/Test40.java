package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        do {


        System.out.println("Please insert a number");
        n = in.nextInt();



        System.out.printf("%d! = %d" , n , factorial(n));
            System.out.println();


    }while (true);
    }

    public static int factorial (int n){
        int facto = 1;

            for (int  i = 1 ; i <= n;   i++)
            facto = facto * i;
            return facto;
        }
    }




