package gr.aueb.cf.geor;

import java.util.Scanner;

public class Askisi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Επιλογή μη αποδεκτή.");
                continue;
            }

            doOnChoice(choice);
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


    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <=6;
    }


    public static void doOnChoice(int choice) {

        switch (choice) {
            case 1:
                System.out.println("Εμφάνισε n αστεράκια οριζόντια");
                Scanner scanner = new Scanner(System.in);
                int i = 1;
                int n = 0;

                System.out.println("Εισάγετε αριθμό αστεριών");
                n = scanner.nextInt();
                while (n >= 1) {
                    System.out.print("*");
                    n--;

                }
                System.out.println();
                break;

            case 2:
                System.out.println("Εμφάνισε n αστεράκια κάθετα");
                Scanner scanner1 = new Scanner(System.in);
                int a = 1;
                int b = 0;

                System.out.println("Εισάγετε αριθμό αστεριών");
                b = scanner1.nextInt();
                while (b >= 1   ) {
                    System.out.println("*");
                    b--;
                }
                break;
            case 3:
                System.out.println("Εμφάνισε n γραμμές με n αστεράκια");
                Scanner scanner2 = new Scanner(System.in);
                System.out.print("Εισάγετε αριθμό αστεριών ");
                int z = scanner2.nextInt();
                for (int d = 0; d < z; d++) {
                    for (int j = 0; j < z; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                    break;
            case 4:
                System.out.println("Εμφάνισε n γραμμές με αστεράκια 1 έως n");
                Scanner scanner3 = new Scanner(System.in);
                System.out.print("Πόσες γραμμές με αστεράκια θέλεις; ");
                int w = scanner3.nextInt();
                for (int q = 1; q <= w; q++) {
                    for (int j = 1; j <= q; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 5:
                System.out.println(" Εμφάνισε n γραμμές με αστεράκια n έως 1");
                Scanner scanner4 = new Scanner(System.in);
                System.out.print("Πόσες γραμμές με αστεράκια θέλεις; ");
                int e = scanner4.nextInt();
                for (int r = e; r >= 1; r--) {
                    for (int j = 1; j <= r; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 6:
                System.out.println(" Έξοδος από το πρόγραμμα");
                System.out.println("Ευχαριστούμε!");
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }
    }
}






