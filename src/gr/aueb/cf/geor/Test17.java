package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num  = 0 ;
        int input = 0;
        int count = 0;

        System.out.println("PLease insert a 3 and over digit number");
        input = in.nextInt();

         num = input;
        do{
          count++;
          num = num / 10;


        }while (num != 0);

        System.out.printf("The number %d : has : %d  ", input ,count);

    }
}
