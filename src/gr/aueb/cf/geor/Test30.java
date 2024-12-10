package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one");
            System.out.println("1. one player");
            System.out.println("2. to player");
            System.out.println("3. team game");
            System.out.println("4.Exit");
            System.out.println("Please insert your choice");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Start one player");
                    break;
                case 2:
                    System.out.println("Start two player");

                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                case 4:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
               }  System.out.println();

            }while (choice != 4);
                System.out.println("Goodbye");
    }
}

