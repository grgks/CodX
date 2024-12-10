package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * υπολογιζει το γινομενο απο το 1 μεχρι το input
 */
public class WhileMul {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        int i= 1;
        int sum = 0;

        System.out.println("Please insert a number");
        input = in.nextInt();

        while (input >= i ) {
            sum  += i;
            i++;

            System.out.println("The mul of numbers until the " + input + "is" + sum);

        }
    }

    public static class IsEven {public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        boolean Even = false;

        System.out.println("Please give a number:");
        input = in.nextInt();

        Even = (input % 2 == 0);

        System.out.printf("The number is :" + Even);


        }
    }
}
