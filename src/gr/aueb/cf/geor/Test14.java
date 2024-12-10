package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int n = 0;
        int result = 1;

        System.out.println("Please insert a number");
        n = sc.nextInt();

        while ( i <= n ){
            result *= i ;
            i++ ;
        }
        System.out.printf("Result : " + result);

    }
}
