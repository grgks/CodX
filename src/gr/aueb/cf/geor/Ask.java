package gr.aueb.cf.geor;

import java.util.Scanner;


public class Ask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int choice = 0;



        do {
            printMenu();
            choice = in.nextInt();
            if (choice <1 || choice> 6){
                System.out.println("Λάθος επιλογή");
                break;
            }
            System.out.println("Παρακαλώ εισάγετε αριθμό αστεριών");
            a = in.nextInt();
            switch (choice) {
                case 1:
                    horizontal(a);
                    System.out.println();
                    break;
                case 2:
                    vertical(a);
                    System.out.println();
                    break;
                case 3:
                    nepin(a);
                    break;
                case 4:
                    enaeosn(a);
                    break;
                case 5:
                    neosena(a);
                    break;



            }

        } while (choice != 6);


    }
            public static void printMenu() {
            System.out.println("Επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");

        }

        public static void horizontal(int a){
            for (int i = 1; i <= a; i++) {
                System.out.printf("*");
            }
        }
        public static void vertical(int a){
            for (int i =1; i <=a; i++ ){
                System.out.println("*");
            }
        }

        public static void nepin(int a){
            for (int i =1; i <= a; i++ ) {

                horizontal(a);
                System.out.println();
            }
        }

        public static void enaeosn(int a){
        for ( int i =1; i <= a; i++){
            horizontal(i);
            System.out.println();
        }
    }

        public static void neosena(int a){
         for (int i = a ; i >= 1 ; i--){
             horizontal(i);
             System.out.println();
         }
        }

}


