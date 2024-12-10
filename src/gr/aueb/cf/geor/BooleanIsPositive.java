package gr.aueb.cf.geor;
/** Δεχεται ακεραιο και ελεγχει αν ειναι θετικος
*/
import java.util.Scanner;

public class BooleanIsPositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isPositive = false;
        int input = 0;

        System.out.println("Please give an integer");
        input = in.nextInt();

        isPositive = input > 0;

        System.out.println("Is positive:" + isPositive);
    }
}
