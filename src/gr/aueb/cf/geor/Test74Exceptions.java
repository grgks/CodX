package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test74Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;


        while (true){
            try {
                System.out.println("Please insert numerator/denominator,for exit press 0");
                numerator = sc.nextInt();
                if (numerator == 0){
                    break;
                }
                denominator = sc.nextInt();
                result = numerator / denominator ;
                System.out.printf("%d / %d = %d", numerator, denominator ,result);
                System.out.println();
            }catch (ArithmeticException e){
                System.out.println("Denominator can not be zero(0)");
        }
    }

        System.out.println("Thanks for using this app :-)");
}
}
