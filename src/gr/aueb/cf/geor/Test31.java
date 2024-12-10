package gr.aueb.cf.geor;

import java.util.Scanner;

public class Test31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        int choice = 0;
        char operator = ' ';
        boolean isError = false;

        System.out.println("Please insert num1 , operator , num2");
        num1 = sc.nextInt();
        operator = sc.next().charAt(0);
        num2 = sc.nextInt();

        switch (operator){
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Error in choice");
                isError = true;
                break;
        }
        if ( ! isError)
            System.out.printf("%d %c %d = %d" , num1, operator, num2, result);
    }
}
