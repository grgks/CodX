package gr.aueb.cf.ch2;

import java.util.Scanner;

/**calculates price with vat
 *
 */
public class PriceWithVat {
    public static void main(String[] args) {
        double insertValue = 0.0;
        double Vat = 0.24;
        double ValueVat = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Parakalw eisagete poso");
        insertValue = in.nextDouble();
        Vat = insertValue * Vat;
        ValueVat = insertValue + Vat;
        System.out.printf("Price: %.2f , Vat: %.2f, Price with Vat:%.2f", insertValue , Vat , ValueVat);
    }




}
