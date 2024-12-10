package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int result = 1;

        while (i <= 10){
        result = result * i ;
        i++ ;
        }
        System.out.printf("Result : " + result);
}
}
