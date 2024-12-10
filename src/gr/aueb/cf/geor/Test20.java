package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        int numerator = 0;
        int denominator = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Please give numerarator");
            numerator = sc.nextInt();

            System.out.println("Please give denominator");

            denominator = sc.nextInt();

            if (!(numerator == 0)){
                if (!(denominator == 0)) {
                    result = numerator / denominator;
                }else {
                    System.out.println("denominator can not be zero");
                break;
                }
            }else {
                System.out.println("Numerator can not be zero");
                break;
                }
            System.out.printf("The numerator %d / denominator %d = %d" ,numerator , denominator , result);
            System.out.println();
    }
}
}





