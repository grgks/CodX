package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = 0;
        int sum = 0;

        System.out.println("Please insert a number");
        n = sc.nextInt();
        while (i < n) {
            sum += i;
            i++;
        }

        System.out.printf("Sum = " + sum);
    }
}
