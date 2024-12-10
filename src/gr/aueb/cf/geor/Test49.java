package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int KEY = 0;
        boolean keyIsFound = false;

        int[] arr = {1, 5 , 8 ,9 ,10 , 15};
        System.out.println("please insert a number");
        KEY = in.nextInt();

        for (int item : arr){
            if (item == KEY){
                keyIsFound = true;
                break;
            }
        }
        if (keyIsFound){
            System.out.println("key was found");
        }else System.out.println("key not found");
    }


    }


