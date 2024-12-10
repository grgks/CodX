package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;

        System.out.println("Please insert a");
        a = sc.nextInt();
        System.out.println("please insert b");
        b = sc.nextInt();

        for (int i = 1; i <= b; i++){
            result = result * a;
        }
        System.out.println("Is " + result);
    }
}
