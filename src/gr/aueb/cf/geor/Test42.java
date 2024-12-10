package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;


        System.out.println("Please insert a number");
        a = in.nextInt();

        System.out.printf(" O %d%s einai artios",a ,  isEven(a));

    }

    public static boolean isEven(int a){
       return  ( a % 2) == 0;
    }

    public static boolean isOdd(int a)
    {
        return !isEven(a);
    }
}
