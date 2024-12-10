package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("Please insert grade");
        choice = sc.nextInt();

        switch (choice){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Under base.Failure");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Please insert grade 1-10");
                break;
        }
    }
}
