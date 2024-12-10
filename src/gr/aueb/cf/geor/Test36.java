package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please insert a, b, c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        isRight = (Math.abs(a*a - b*b - c*c) <= EPSILON);
        System.out.println("Triangle is right: " + isRight);

    }
}
