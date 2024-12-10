package gr.aueb.cf.geor;

import java.util.Scanner;

public class SquareAskisi {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int square = 0;
        System.out.println("Παρακαλώ εισάγεται εναν ακέραιο :");
        i = scanner.nextInt();
       if (i >0)
           square = i * i ;
       else System.out.println("Wrong");

            System.out.printf("Η ρίζα του %d" + " είναι %d", i, square);



        }


    }
