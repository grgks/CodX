package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;


        System.out.println("Please insert a,b");
        a = sc.nextInt();
        b = sc.nextInt();

        while (a >0 && b > 0){
            sum = a * (a * b);
            break;



        }
        System.out.printf("%d ^ %d = %d" ,a , b, sum );
    }
}
