package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int inputTemp = 0 ;


        System.out.println("Please insert if it is raining (True/false");
        isRaining = sc.nextBoolean();
        System.out.println("Please inseert temparature");
        inputTemp = sc.nextInt();


        isSnowing =  isRaining && (inputTemp < 0) ;

        System.out.printf("Is snowing " + isSnowing);

    }
}
