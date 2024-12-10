package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int min = 0;
        ;

        while (true){
            System.out.println("Please give number A");
            a = sc.nextInt();
            System.out.println("Please give number B");
            b = sc.nextInt();

            if (!( a == 0 ) && ! ( b == 0)){
                    if (a < b ){
                        System.out.println("A is min " + a);
                }else {
                        System.out.println("B is min " + b);
                    }
            }else System.out.println("Can not be zero");
        }
    }
}

