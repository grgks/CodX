package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean found = false;

        while(!found){
            System.out.println("please give a number");
            num = sc.nextInt();
            if (num != 12 && num != 5 && num != 70){
                System.out.println("No lucky number given");
                break;
            }
            if(num == 5){
                found = true;
            }else if (num == 12 ){
                found = true;
            }
            System.out.println("NO lucky number");
        }
        if(found) System.out.println("Lucky number found BINGO" + num);
        else System.out.println("Try again");
    }
}
