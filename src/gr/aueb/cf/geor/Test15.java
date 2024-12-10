package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 0;
        int end = 0 ;
        int step = 0;
        int counter = 0;
        int times = 1;

        while (times <= 3){
        System.out.println("Please insert start , end , step");
        start = sc.nextInt();
        end = sc.nextInt();
        step = sc.nextInt();

        while (start <= end ) {
            counter += 1;
            start += step;

        }
        System.out.printf("Repeats :" + counter);
            System.out.println();
        times++;
}
}
}
