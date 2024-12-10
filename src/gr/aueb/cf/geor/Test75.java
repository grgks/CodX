package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test75 {
    public static void main(String[] args) {
        int counter = 0;
        int a =12;
        for (int i = 1; i <= a; i++) {
            if ((i % 2) == 0) counter++;
        }
        System.out.println(counter);
    }
}

