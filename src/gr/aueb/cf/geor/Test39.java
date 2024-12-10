package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test39 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int num1 = 0, num2 = 0, result = 0;


        do {
            printMenu();
            System.out.println("Παρακαλω επιλεξτε");
            choice = insertChoice();

            if (choice < 1 || choice > 6) {
                System.out.println("Λαθος Επιλογη");
                continue;
            }

            System.out.println("Παρακαλω εισαγετε δυο αριθμους");
            num1 = getOneNumber();
            num2 = getOneNumber();
            result = getChoice(choice, num1, num2);
            System.out.println("Αποτελεσμα: " + result);
            System.out.println();

        } while (choice != 6);
        {
            System.out.println("Ευχαριστουμε που χρησιμοποιησατε την εφαρμογη μας");
        }
    }
    public static void printMenu(){
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο Διαίρεσης");
        System.out.println("6. Έξοδος");
    }
    public static int insertChoice(){
        return sc.nextInt();
    }

    public static int add(int a , int b){
        return a + b;
    }

    public static int sub(int a , int b) {
        return a - b;
    }

    public static int mul(int a , int b) {
        return a * b;
        }

    public static int div(int a , int b) {
        if (b == 0 ) {
            System.out.println("Invalid number");
            return 0;
        }
        return a / b;
    }

    public static int mod(int a , int b) {
        if (b == 0 ) {
            System.out.println("Invalid number");
            return 0;
        }
        return a % b;
    }

    public static int getChoice(int choice, int num1 ,int num2){
        int result = 0;

        switch (choice){
            case 1:
                result = add(num1 , num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1,num2);
                break;
            default:
                System.out.println("Λαθος επιλογη");
        }return result;
    }

    public static int getOneNumber(){
        return sc.nextInt();
    }
}


