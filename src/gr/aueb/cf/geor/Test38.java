package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            menuApp();
            choice = sc.nextInt();
            if (choice < 1 || choice > 5){
                System.out.println("Λαθος Επιλογη");
                break;
            }
            switch (choice){
                case 1:
                    System.out.println("1. επιτυχης εισαγωγη");
                            break;
                case 2:
                    System.out.println("2.Επιτυχης Διαγραφη");
                    break;
                case 3:
                    System.out.println("3.Επιτυχης Αναζητηση");
                    break;
                case 4:
                    System.out.println("4.Επιτυχης Ενημερωση");
                    break;
                case 5:
                    System.out.println("5. Εξοδος");
                    break;
            }
        }while (choice !=5);{

        }




    }
    public static void menuApp(){
        System.out.println("Επιλεξτε ενα απο τα παρακατω");
        System.out.println("1. Εισαγωγη");
        System.out.println("2. Διαγραφη");
        System.out.println("3. Αναζητηση");
        System.out.println("4. Ενημερωση");
        System.out.println("5. Εξοδος");
    }
}
