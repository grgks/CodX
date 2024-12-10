package gr.aueb.cf.geor;


import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputEuros = 0 ;
        int euros500, euros100, euros50, euros20, euros10, euros5, euros1;

        int remaingEuros = 0;


        System.out.println("Please insert amount");
        inputEuros = sc.nextInt();

         remaingEuros = inputEuros;

        euros500 = remaingEuros / 500;
        remaingEuros = remaingEuros % 500;

        euros100 = remaingEuros / 100;
        remaingEuros = remaingEuros % 100;

        euros50 = remaingEuros / 50;
        remaingEuros = remaingEuros % 50;

        euros20 = remaingEuros / 20;
        remaingEuros = remaingEuros % 20;

        euros10 = remaingEuros / 10;
        remaingEuros = remaingEuros % 10;

        euros5 = remaingEuros / 5;
        remaingEuros = remaingEuros % 5;



        System.out.printf("%d euros = euros500: %d, euros100: %d euros50: %d\n",inputEuros , euros500 , euros100 , euros50);
        System.out.printf("euros20: %d, euros10: %d, euros5: %d, euros: %d",euros20 , euros10 , euros5, remaingEuros);



    }
}
