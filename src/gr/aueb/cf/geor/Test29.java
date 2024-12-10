package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int iterations = 0;


        System.out.println("Please give start , end , step");
        startValue = sc.nextInt();
        endValue = sc.nextInt();
        step = sc.nextInt();

        for (int i = startValue; i <= endValue; i = i + step ){
            iterations ++;
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("iterations :" + iterations);




    }
}
