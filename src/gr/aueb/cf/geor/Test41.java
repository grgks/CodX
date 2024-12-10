package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;

        System.out.println("Please insert (a) and (n)");
        a = in.nextInt();
        n = in.nextInt();

        System.out.printf("a :%d ^ n :%d = %d " ,a ,n , power(a , n) );

    }

    public static int power(int a, int n){
        int power = 1;
        for (int i = 1; i <= n; i++ )
            power = power * a;
        return power;



    }
}
