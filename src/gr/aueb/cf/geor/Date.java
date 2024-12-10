package gr.aueb.cf.geor;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Parakalw dwste hmeromhnia : (dd/mm/year)");

        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        System.out.printf("H hmeromhnia einai: 0%d/0%d/%d",num1, num2, num3);








    }
}
